/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacetesting;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author stx
 */
public class MainFrame extends JFrame{
    
    public MainFrame(){
        setLayout(new BorderLayout());
        
        add(new JLabel("cositas"), BorderLayout.CENTER);
        add(new JTextField(),BorderLayout.NORTH);
        
        setVisible(true);
        setTitle("TEST");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
