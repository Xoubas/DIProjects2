package reservasalon;

import javax.swing.*;
import java.awt.*;

public class DatosPersona extends JPanel {

    private JLabel labNombre, labTelefono, labEmail;
    private JTextField texNombre, texTelefono, texEmail;

    public DatosPersona() {
        setLayout(new GridLayout(3, 2, 5, 5));
        setBorder(BorderFactory.createTitledBorder("Datos personales reserva"));

        labNombre = new JLabel("Nombre:");
        add(labNombre);
        texNombre = new JTextField(20); // Increased to a reasonable size
        add(texNombre);

        labTelefono = new JLabel("Teléfono:");
        add(labTelefono);
        texTelefono = new JTextField(20); // Increased to a reasonable size
        add(texTelefono);

        labEmail = new JLabel("Email:");
        add(labEmail);
        texEmail = new JTextField(20); // Increased to a reasonable size
        add(texEmail);
    }
}
