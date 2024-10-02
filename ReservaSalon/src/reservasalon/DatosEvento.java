/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasalon;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author stx
 */
public class DatosEvento extends JPanel {

    private Border innerBorder, outerBorder;

    public DatosEvento() {

        setLayout(new GridLayout(6, 2, 1, 1));
        innerBorder = BorderFactory.createTitledBorder("Datos personales reserva");
        outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
    }
}
