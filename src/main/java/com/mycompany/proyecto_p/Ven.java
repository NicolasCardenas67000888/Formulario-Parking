/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_p;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Usuario
 */
public class Ven extends JFrame {
    JLabel jTexto;
    JTextField jEntero , jNombre, jApellido ;
    JButton jboton ;
    JComboBox <String> jsex ;
    public Ven (){
        super ("Parqueadero ");
        setSize(500,500);
        //centrar en pantalla
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.cyan);
        setLayout(null);
        crearGUI();
        setVisible(true);
}   public void crearGUI(){
    jTexto = new JLabel ("Parqueadero");
    jTexto.setBounds(0,0,500,80);
    jTexto.setFont(new Font ("Tahoma" , Font.BOLD, 30));
    jTexto.setHorizontalAlignment(SwingConstants.CENTER);
    add(jTexto);
    jTexto = new JLabel ("Numero placa: ");
    jTexto.setBounds(30,40,125,80);
    jTexto.setFont(new Font ("Tahoma" , Font.BOLD, 16));
    jTexto.setHorizontalAlignment(SwingConstants.LEFT);
    add(jTexto);
    jNombre = new JTextField();
    jNombre.setBounds(170,70,125,20);
    jNombre.setFont(new Font ("Tahoma" , Font.BOLD, 16));
    add(jNombre);
    jTexto = new JLabel ("Hora de ingreso: ");
    jTexto.setBounds(30,60,140,80);
    jTexto.setFont(new Font ("Tahoma" , Font.BOLD, 16));
    jTexto.setHorizontalAlignment(SwingConstants.LEFT);
    add(jTexto);
    jApellido = new JTextField();
    jApellido.setBounds(170,90,125,20);
    jApellido.setFont(new Font ("Tahoma" , Font.BOLD, 16));
    add(jApellido);
    jTexto = new JLabel ("Hora de salida: ");
    jTexto.setBounds(30,80,140,80);
    jTexto.setFont(new Font ("Tahoma" , Font.BOLD, 16));
    jTexto.setHorizontalAlignment(SwingConstants.LEFT);
    add(jTexto);
    jEntero = new JTextField();
    jEntero.setBounds(170,110,125,20);
    jEntero.setFont(new Font ("Tahoma" , Font.BOLD, 16));
    add(jEntero);
    
    jboton = new JButton ("Guardar");
    jboton.setBounds(70, 200, 100, 30);
    jboton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            evento_jboton();
        }
    });
    add(jboton);
    jTexto = new JLabel ("Pago: ");
    jTexto.setBounds(30,100,80,80);
    jTexto.setFont(new Font ("Tahoma" , Font.BOLD, 16));
    jTexto.setHorizontalAlignment(SwingConstants.LEFT);
    add(jTexto);
    jsex = new JComboBox<>();
    jsex.addItem("Efectivo");
    jsex.addItem("Tarjeta");
    jsex.addItem("Otro") ;
    jsex.setBounds(170, 130, 125, 25);
    add(jsex);
}
public void evento_jboton(){
    String nombre = jNombre.getText();
    String apellido = jApellido.getText();
    String edad = jEntero.getText();
    String sexo = (String) jsex.getSelectedItem();
    JOptionPane.showMessageDialog(this,
            "Se ha guardado satisfactoriamente \n"+
            nombre + "\n" + 
            apellido + "\n"+
            edad + "\n"+ sexo
                    
    );
}
       
}
