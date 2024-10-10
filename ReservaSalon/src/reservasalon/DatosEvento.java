package reservasalon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import javax.swing.border.CompoundBorder;

public class DatosEvento extends JPanel {

    private JSpinner spinnerFecha, spinnerAsistentes, spinnerDias, spinnerHabitaciones;
    private JComboBox<String> comboTipo;
    private JList<String> listComida;
    private JTextField textHabitaciones;

    public DatosEvento() {
        // Establecer el layout y el borde
        setLayout(new GridLayout(6, 2, 5, 5));

        // Componente para seleccionar la fecha
        add(new JLabel("Fecha:"));
        Date today = new Date();
        // Create a spinner model with today's date as the minimum value, no max value, and increment by days
        SpinnerDateModel dateModel = new SpinnerDateModel(today, today, null, Calendar.DAY_OF_MONTH);
        spinnerFecha = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(spinnerFecha, "dd/MM/yy HH:mm");
        spinnerFecha.setEditor(timeEditor);
        spinnerFecha.setValue(new Date()); // Fecha actual
        spinnerFecha.setToolTipText("Fecha del evento");
        add(spinnerFecha);

        // Componente para seleccionar el tipo de evento
        add(new JLabel("Tipo:"));
        String[] tiposEvento = {"Boda/Comunion/Bautizo", "Cumpleaños", "Reunion empresa"};
        comboTipo = new JComboBox<>(tiposEvento);
        comboTipo.setSelectedIndex(-1);
        comboTipo.setToolTipText("Tipo de evento");
        add(comboTipo);

        // Campo para número de asistentes
        add(new JLabel("N° Asistentes:"));
        SpinnerNumberModel assistantModel = new SpinnerNumberModel(1, 1, 100, 1);
        spinnerAsistentes = new JSpinner(assistantModel);
        spinnerAsistentes.setToolTipText("Numero de asistentes");
        add(spinnerAsistentes);

        // Componente para seleccionar la comida
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

        // Campo para número de días
        add(new JLabel("N° días:"));
        SpinnerNumberModel modelDias = new SpinnerNumberModel(1, 1, 100, 1);
        spinnerDias = new JSpinner(modelDias);
        spinnerDias.setEnabled(false);
        spinnerDias.setToolTipText("Duracion del evento");
        add(spinnerDias);

        // Campo para habitaciones
        add(new JLabel("Habitaciones:"));
        spinnerHabitaciones = new JSpinner(new SpinnerNumberModel(0, 1, 100, 1));
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
        String tipoEvento = comboTipo.getSelectedItem().toString();

        // Desactivar/Activar campos según el tipo de evento seleccionado
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
            // En caso de eventos genéricos, ambos campos activados
            spinnerDias.setEnabled(true);
            spinnerHabitaciones.setEnabled(true);
        }
    }
}
