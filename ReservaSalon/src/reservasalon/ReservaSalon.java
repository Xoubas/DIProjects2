/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservasalon;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author stx
 */
public class ReservaSalon extends JFrame {

    DatosPersona datosPersona;
    DatosEvento datosEvento;
    JButton reservaBut;

    public ReservaSalon() {
        setLayout(new BorderLayout());

        datosPersona = new DatosPersona();
        JPanel panel = new JPanel();
        panel.add(datosPersona);

        add(panel, BorderLayout.LINE_START);
        add(new JLabel("Cositas"), BorderLayout.CENTER);

        setTitle("Reserva salon");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ReservaSalon();
    }

}
