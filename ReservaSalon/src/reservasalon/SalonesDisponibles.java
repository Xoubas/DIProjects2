/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasalon;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author stx
 */
public class SalonesDisponibles extends JPanel {

    private DisponiblesListener dl;

    public SalonesDisponibles() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Salones disponibles para reservar"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        JButton button = new JButton("Salon principal");
            button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dl.showReservaSalon(true);
            }
        });
        add(button, gbc);
    }

    public void setDisponibles(DisponiblesListener dl) {
        this.dl = dl;
    }
}
