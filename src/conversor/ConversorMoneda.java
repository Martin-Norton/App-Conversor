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


public class ConversorMoneda extends JFrame{
    
    private JMenuBar menuBarMoneda;
    private JMenu menu;
    
    private JMenuItem opcion1;
    private JMenuItem opcion2;
    private JMenuItem opcion3;
    private JMenuItem opcion4;
    private JMenuItem opcion5;
    private JMenuItem opcion6;
    private JMenuItem opcion7;
    private JMenuItem opcion8;
    private JMenuItem opcion9;
    private JMenuItem opcion10;
    private JMenuItem opcion11;
    
    public ConversorMoneda(){
        setSize(600,400);
        setTitle("Menu Conversor de Moneda");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        mostrarMenu();
        
        panel.add(menuBarMoneda);
        add(panel);      
    }
    public double ingreso(){
        int ver = 0;
        String input = JOptionPane.showInputDialog("Ingrese el monto que desea convertir:");
        double valor = Double.parseDouble(input);
      while (ver == 1) {            
        input = JOptionPane.showInputDialog("Ingrese el monto que desea convertir:");
        valor = Double.parseDouble(input);
        if (valor >= 0 ) {
            ver = 1;
        } else {
            ver = 0;
        }
      }
      return valor;
    }
    
    public void mostrarMenu(){
      //inicialización de los atributos
      menuBarMoneda = new JMenuBar();

      menu = new JMenu("Elija una opcion de conversion");
      opcion1 = new JMenuItem("Pesos a Dolares");
      opcion2 = new JMenuItem("Pesos a Euros");
      opcion4 = new JMenuItem("Pesos a Libras");
      opcion5 = new JMenuItem("Pesos a Yen");
      opcion6 = new JMenuItem("Pesos a Won Coreano");
      opcion7 = new JMenuItem("Dolares a Pesos");
      opcion8 = new JMenuItem("Euros a pesos");
      opcion9 = new JMenuItem("Libras a Pesos");
      opcion10 = new JMenuItem("Yen a Pesos");
      opcion11 = new JMenuItem("Won Coreano a Pesos");
      opcion3 = new JMenuItem("Salir");
      
      menu.add(opcion1);
      menu.add(opcion2);
      menu.add(opcion4);
      menu.add(opcion5);
      menu.add(opcion6);
      menu.add(opcion7);
      menu.add(opcion8);
      menu.add(opcion9);
      menu.add(opcion10);
      menu.add(opcion11);
      menu.add(opcion3);
      
      menuBarMoneda.add(menu);
              
      opcion1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null, "el valor convertido a dolares es: " + (ingreso()/500));
          }
      });
      
      opcion2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null, "el valor convertido a euros es: " + (ingreso()/700));
          }
      });
      opcion4.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null, "el valor convertido a Libras es: " + (ingreso()/600));
          }
      });
      opcion5.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null, "el valor convertido a Yenes es: " + (ingreso()/90));
          }
      });
      opcion6.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null, "el valor convertido a Won Coreano es: " + (ingreso()/300));
          }
      });
      opcion7.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null, "el valor convertido de dolares a Pesos es: " + (ingreso()*500));
          }
      });
      opcion8.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null, "el valor convertido de Euros a Pesos es: " + (ingreso()*700));
          }
      });
      opcion9.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null, "el valor convertido de Libras a Pesos es: " + (ingreso()*600));
          }
      });
      opcion10.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null, "el valor convertido de Yenes a Pesos es: " + (ingreso()*90));
          }
      });
      opcion11.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null, "el valor convertido de Won coreano a Pesos es: " + (ingreso()*300));
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
