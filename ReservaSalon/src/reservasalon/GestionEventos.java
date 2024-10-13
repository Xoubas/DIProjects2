package reservasalon;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class GestionEventos extends JFrame {

    JMenuBar menuBar;
    JMenuItem inicioItem, salonesItem;
    Inicio inicio;
    SalonesDisponibles salonesDisponibles;
    CardLayout cardLayout;
    JPanel panelCentral;
    ReservaSalon reservaSalon;

    public GestionEventos() {
        setTitle("Gestion Hostelera Empresa BK");
        setLayout(new BorderLayout());

        // Initialize the menu bar and add it to the frame
        setJMenuBar(setMenu());
        add(new JLabel("GESTION EVENTOS EMPRESA BK"), BorderLayout.NORTH);

        // Initialize the dialog for reservations
        reservaSalon = new ReservaSalon(); // Make sure this dialog is created

        // Create the central panel with CardLayout
        panelCentral = new JPanel();
        cardLayout = new CardLayout();
        panelCentral.setLayout(cardLayout);

        // Initialize panels
        inicio = new Inicio();
        salonesDisponibles = new SalonesDisponibles();

        // Set the listener for the SalonesDisponibles panel
        salonesDisponibles.setDisponibles(new DisponiblesListener() {
            @Override
            public void showReservaSalon(boolean value) {
                reservaSalon.setVisible(value); // Show or hide the dialog based on the boolean value
            }
        });

        // Add the central panel to the center of the BorderLayout
        add(panelCentral, BorderLayout.CENTER);

        // Create and add the different panels (cards) to the CardLayout panel
        panelCentral.add(inicio, "Inicio");
        panelCentral.add(salonesDisponibles, "Salones");

        // Show the default panel (Inicio)
        cardLayout.show(panelCentral, "Inicio");

        // Set up the main window properties
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);

        // Add the menu item actions
        setMenuActions();
    }

    private JMenuBar setMenu() {
        menuBar = new JMenuBar();

        inicioItem = new JMenuItem("Inicio");
        menuBar.add(inicioItem);

        salonesItem = new JMenuItem("Salones disponibles");
        menuBar.add(salonesItem);

        return menuBar;
    }

    private void setMenuActions() {
        // Action for the "Inicio" menu item
        inicioItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelCentral, "Inicio");
            }
        });

        // Action for the "Salones disponibles" menu item
        salonesItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelCentral, "Salones");
            }
        });
    }

    public static void main(String[] args) {
        new GestionEventos();
    }
}
