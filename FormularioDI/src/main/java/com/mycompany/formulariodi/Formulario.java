/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formulariodi;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author stx
 */
public class Formulario extends JFrame{
    JPanel form;
    JLabel nameLab;
    JLabel occupLab;
    JTextField name;
    JTextField occupation;
    JButton ok;
    GridBagConstraints gbc = new GridBagConstraints();
    

    public Formulario() {
        form = new JPanel();
        nameLab = new JLabel("Name");
        occupLab = new JLabel("Occupation");
        name = new JTextField(10);
        occupation = new JTextField(10);
        ok = new JButton();
        
        
        setVisible(true);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
    }
    
}
