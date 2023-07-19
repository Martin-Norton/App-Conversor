/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConversorGraficoPrincipal extends JFrame{
    
    private JMenuBar menuBar;
    private JMenu menu;
    
    private JMenuItem opcion1;
    private JMenuItem opcion2;
    private JMenuItem opcion3;    
    
    public ConversorGraficoPrincipal(){
        setSize(600,400);
        setTitle("Menu Conversores");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        mostrarMenu();
        
        panel.add(menuBar);
        add(panel);      
    }
    
    public void mostrarMenu(){
      //inicialización de los atributos
      menuBar = new JMenuBar();
      menu = new JMenu("Elija una opcion ");
      opcion1 = new JMenuItem("Conversor de moneda");
      opcion2 = new JMenuItem("Conversor de medidas");
      opcion3 = new JMenuItem("Salir");
      
      menu.add(opcion1);
      menu.add(opcion2);
      menu.add(opcion3);
      
      menuBar.add(menu);
      opcion1.addActionListener(new ActionListener() {
          @Override
         public void actionPerformed(ActionEvent e) {
                // Crear y mostrar el nuevo JFrame con el nuevo menú
                JFrame conversorMoneda = new ConversorMoneda();
                JMenuBar menuBar = conversorMoneda.getJMenuBar(); // Crear el nuevo menú

                conversorMoneda.setJMenuBar(menuBar);
                conversorMoneda.setSize(300, 200);
                conversorMoneda.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                conversorMoneda.setVisible(true);
            }
      });
      
      opcion2.addActionListener(new ActionListener() {
          @Override
         public void actionPerformed(ActionEvent e) {
                // Crear y mostrar el nuevo JFrame con el nuevo menú
                JFrame conversorMedidas = new ConversorMedidas();
                JMenuBar menuBar = conversorMedidas.getJMenuBar(); // Crear el nuevo menú

                conversorMedidas.setJMenuBar(menuBar);
                conversorMedidas.setSize(300, 200);
                conversorMedidas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                conversorMedidas.setVisible(true);
            }
      });
     
      opcion3.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null, "Saliendo...");
              System.exit(0);
          }
      });
    }
    
    public static void main(String[] args) {
       
        ConversorGraficoPrincipal window = new ConversorGraficoPrincipal();
        window.setVisible(true);
    }
}
