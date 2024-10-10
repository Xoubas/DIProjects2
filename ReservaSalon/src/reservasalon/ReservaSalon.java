/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservasalon;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author stx
 */
public class ReservaSalon extends JDialog {

    DatosPersona datosPersona;
    DatosEvento datosEvento;
    JButton reservaBut;

    public ReservaSalon() {
        setLayout(new BorderLayout());
        setTitle("Reserva salon principal");

        datosPersona = new DatosPersona();
        add(datosPersona, BorderLayout.NORTH);

        datosEvento = new DatosEvento();
        add(datosEvento, BorderLayout.CENTER);

        add(new JButton("Reservar"), BorderLayout.SOUTH);
 
        setTitle("Reserva salon");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 500);
        setVisible(true);
    }
}
