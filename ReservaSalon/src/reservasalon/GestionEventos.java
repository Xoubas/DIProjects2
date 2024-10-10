/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasalon;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author stx
 */
public class GestionEventos extends JFrame{
    JMenuBar menuBar;
    JMenuItem inicioItem, salonesItem;
    
    public GestionEventos(){
        setLayout(new BorderLayout());
        setTitle("Gestion Hostelera Empresa BK");
        
        
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
    }
    
    private JMenuBar setMenu(){
        menuBar = new JMenuBar();
        
        inicioItem = new JMenuItem("Inicio");
        menuBar.add(inicioItem);
        
        salonesItem = new JMenuItem("Salones disponibles");
        menuBar.add(salonesItem);
        
    }
}
