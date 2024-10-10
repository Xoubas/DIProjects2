/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasalon;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author stx
 */
public class DatosPersona extends JPanel {

    private JLabel labNombre, labTelefono, labEmail;
    private JTextField texNombre, texTelefono, texEmail;

    public DatosPersona() {
        setLayout(new GridLayout(3, 2, 5, 5));
        setBorder(BorderFactory.createTitledBorder("Datos personales reserva"));

        labNombre = new JLabel("Nombre");
        add(labNombre);
        texNombre = new JTextField(3);
        add(texNombre);

        labTelefono = new JLabel("Teléfono");
        add(labTelefono);
        texTelefono = new JTextField(3);
        add(texTelefono);

        labEmail = new JLabel("Email");
        add(labEmail);
        texEmail = new JTextField(3);
        add(texEmail);
    }
}
