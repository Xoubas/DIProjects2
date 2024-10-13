package reservasalon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class DatosEvento extends JPanel {

    private JSpinner spinnerFecha, spinnerAsistentes, spinnerDias, spinnerHabitaciones;
    private JComboBox<String> comboTipo;
    private JList<String> listComida;

    public DatosEvento() {
        // Set layout and border
        setLayout(new GridLayout(6, 2, 5, 5));

        // Date selection component
        add(new JLabel("Fecha:"));
        Date today = new Date();
        // Create a spinner model with today's date as the minimum value, no max value, and increment by days
        SpinnerDateModel dateModel = new SpinnerDateModel(today, today, null, Calendar.DAY_OF_MONTH);
        spinnerFecha = new JSpinner(dateModel);
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(spinnerFecha, "dd/MM/yy HH:mm");
        spinnerFecha.setEditor(timeEditor);
        spinnerFecha.setToolTipText("Fecha del evento");
        add(spinnerFecha);

        // Event type selection component
        add(new JLabel("Tipo:"));
        String[] tiposEvento = {"Boda/Comunion/Bautizo", "Cumpleaños", "Reunion empresa"};
        comboTipo = new JComboBox<>(tiposEvento);
        comboTipo.setSelectedIndex(-1);
        comboTipo.setToolTipText("Tipo de evento");
        add(comboTipo);

        // Number of attendees field
        add(new JLabel("N° Asistentes:"));
        SpinnerNumberModel assistantModel = new SpinnerNumberModel(1, 1, 100, 1);
        spinnerAsistentes = new JSpinner(assistantModel);
        spinnerAsistentes.setToolTipText("Numero de asistentes");
        add(spinnerAsistentes);

        // Food selection component
        add(new JLabel("Selección comida:"));
        DefaultListModel<String> comidaModel = new DefaultListModel<>();
        comidaModel.addElement("Menu cerrado");
        comidaModel.addElement("A la carta");
        comidaModel.addElement("Lo ponen los clientes");
        comidaModel.addElement("Por concretar");
        listComida = new JList<>(comidaModel);
        JScrollPane pane = new JScrollPane(listComida);
        pane.setPreferredSize(new Dimension(150, 60));
        pane.setToolTipText("Tipos de comida");
        add(pane);

        // Number of days field
        add(new JLabel("N° días:"));
        SpinnerNumberModel modelDias = new SpinnerNumberModel(1, 1, 100, 1);
        spinnerDias = new JSpinner(modelDias);
        spinnerDias.setEnabled(false);
        spinnerDias.setToolTipText("Duracion del evento");
        add(spinnerDias);

        // Rooms field
        add(new JLabel("Habitaciones:"));
        spinnerHabitaciones = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1)); // Changed minimum to 0
        spinnerHabitaciones.setEnabled(false);
        spinnerHabitaciones.setToolTipText("Habitaciones");
        add(spinnerHabitaciones);

        // Action listeners
        comboTipo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarCampos();
            }
        });
    }

    private void actualizarCampos() {
        String tipoEvento = (String) comboTipo.getSelectedItem();

        // Activate/Deactivate fields based on the selected event type
        if (tipoEvento.equals("Cumpleaños")) {
            spinnerDias.setEnabled(false);
            spinnerHabitaciones.setEnabled(false);
        } else if (tipoEvento.startsWith("Boda")) {
            spinnerDias.setEnabled(false);
            spinnerHabitaciones.setEnabled(true);
        } else if (tipoEvento.startsWith("Reunion")) {
            spinnerDias.setEnabled(true);
            spinnerHabitaciones.setEnabled(false);
        } else {
            // For generic events, both fields activated
            spinnerDias.setEnabled(true);
            spinnerHabitaciones.setEnabled(true);
        }
    }
}
