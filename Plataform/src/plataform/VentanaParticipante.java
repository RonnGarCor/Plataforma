/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plataform;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 */
public class VentanaParticipante extends JFrame {
    JPanel panel;   
    ArrayList <String> lista;
    public VentanaParticipante (){
            this.setSize (350,600);
            setTitle ("LISTA PARTICIPANTES");
            setLocationRelativeTo (null);
            panel();
            mostrar();
            Toolkit logo= Toolkit.getDefaultToolkit();
             Image miLogo = logo.getImage("imagenes/pf3.png");
            setIconImage(miLogo);
            setDefaultCloseOperation (DISPOSE_ON_CLOSE);
            imagen();
            fondo();
            
        }
        
        public void panel (){
            panel = new JPanel();
            this.getContentPane().add(panel);
            panel.setLayout (null);
        }
        
        public void mostrar (){
           int i = 45;
            try{
            Connection conex = Conexion.getConexion ();
            Statement sta = conex.createStatement();
            ResultSet rs = sta.executeQuery("SELECT nomParticipante FROM Participantes");
            while (rs.next()){
                String nomBase = rs.getString ("nomParticipante");
                JLabel nombre = new JLabel (nomBase);
                panel.add(nombre);
                nombre.setVisible (true);
                nombre.setBounds (10,i,300,25);
                i = i +30;
            }
            }catch (SQLException ex){ 
            }
           
        }
        
        private void fondo(){
        
           JLabel fondo = new JLabel();
           ImageIcon imagen= new ImageIcon("Imagenes/fondo.png");
           fondo.setBounds(0,0,350,600);
           fondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(),Image.SCALE_SMOOTH )));
           panel.add(fondo); 
           
        }
        
        private void imagen()
        {
            JLabel icono = new JLabel();
            ImageIcon imagen1= new ImageIcon("Imagenes/iconoparti.png");
            icono.setBounds(0,0,152,37);
            icono.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(icono.getWidth(), icono.getHeight(),Image.SCALE_SMOOTH )));
            panel.add(icono); 
        }

 }

