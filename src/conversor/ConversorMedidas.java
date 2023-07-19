/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ConversorMedidas extends JFrame{
    
    private JMenuBar menuBarMoneda;
    private JMenu menu;
    
    private JMenuItem opcion1;
    private JMenuItem opcion2;
    private JMenuItem opcion3;    
    
    public ConversorMedidas(){
        setSize(600,400);
        setTitle("Menu Conversor de Medidas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        mostrarMenu();
        
        panel.add(menuBarMoneda);
        add(panel);      
    }
    
    public void mostrarMenu(){
      //inicialización de los atributos
      menuBarMoneda = new JMenuBar();
      menu = new JMenu("Elija una opcion ");
      opcion1 = new JMenuItem("cm a mts");
      opcion2 = new JMenuItem("mts a cm");
      opcion3 = new JMenuItem("Salir");
      
      menu.add(opcion1);
      menu.add(opcion2);
      menu.add(opcion3);
      
      menuBarMoneda.add(menu);
      
      String input = JOptionPane.showInputDialog("ingrese el valor de la medida a convertir");
      double medida = Double.parseDouble(input);
      opcion1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null, "el valor convertido a metros es: " + (medida * 0.01));
          }
      });
      opcion2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null, "el valor convertido a centimetros es: " + (medida * 100));
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
        ConversorMoneda window = new ConversorMoneda();
        window.setVisible(true);
    }
    
}