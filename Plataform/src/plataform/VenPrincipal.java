/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plataform;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Beimar
 */
public class VenPrincipal extends JFrame implements ActionListener   {
    JPanel fondoP;
    JButton boton ;
    VentanaParticipante ventana= new VentanaParticipante();
    public VenPrincipal(){
    this.setSize(1500,1000);
    setTitle("PlataForm");
    setLocationRelativeTo(null);
    this.setResizable(false);
     fondoP= new JPanel();   
    this.getContentPane().add(fondoP);
    fondoP.setLayout(null);
    
     imagen();
     fondoPrin();
   
    Botones();
    Toolkit logo= Toolkit.getDefaultToolkit();
    Image miLogo = logo.getImage("imagenes/pf3.png");
    setIconImage(miLogo);
    setVisible(true);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
private void fondoPrin(){
   /*  fondoP= new JPanel();   
    this.getContentPane().add(fondoP);
    fondoP.setLayout(null);
    */
     JLabel imgF = new JLabel();
    ImageIcon imagenes= new ImageIcon("imagenes/naranja.png");
    imgF.setBounds(0,860,1500,130);
    imgF.setIcon(new ImageIcon(imagenes.getImage().getScaledInstance(imgF.getWidth(), imgF.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(imgF);
    
    JLabel imgFondo = new JLabel();
    ImageIcon imagen= new ImageIcon("imagenes/negro.png");
    imgFondo.setBounds(0,0,1500,1000);
    imgFondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(imgFondo.getWidth(), imgFondo.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(imgFondo);
   
   
 }
private void imagen (){
    
    JLabel plataform = new JLabel();
    ImageIcon imagene= new ImageIcon("imagenes/plataform.png");
   plataform.setBounds(20,20,120,80);
    plataform.setIcon(new ImageIcon(imagene.getImage().getScaledInstance(plataform.getWidth(), plataform.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(plataform);

 JLabel imgF = new JLabel();
    ImageIcon imagenes= new ImageIcon("imagenes/invitar.png");
    imgF.setBounds(200,865,100,100);
    imgF.setIcon(new ImageIcon(imagenes.getImage().getScaledInstance(imgF.getWidth(), imgF.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(imgF);
    
 JLabel img1 = new JLabel();
    ImageIcon imagenes1= new ImageIcon("imagenes/chat.png");
    img1.setBounds(350,865,100,100);
    img1.setIcon(new ImageIcon(imagenes1.getImage().getScaledInstance(img1.getWidth(), img1.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(img1);
    
 JLabel imgF2 = new JLabel();
    ImageIcon imagenes2= new ImageIcon("imagenes/salir1.png");
    imgF2.setBounds(650,865,100,100);
    imgF2.setIcon(new ImageIcon(imagenes2.getImage().getScaledInstance(imgF2.getWidth(), imgF2.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(imgF2);
    
 JLabel imgF3 = new JLabel();
    ImageIcon imagenes3= new ImageIcon("imagenes/microfono.png");
    imgF3.setBounds(800,865,100,100);
    imgF3.setIcon(new ImageIcon(imagenes3.getImage().getScaledInstance(imgF3.getWidth(), imgF3.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(imgF3);

 
 JLabel imgF4 = new JLabel();
    ImageIcon imagenes4= new ImageIcon("imagenes/video.png");
    imgF4.setBounds(950,865,100,100);
    imgF4.setIcon(new ImageIcon(imagenes4.getImage().getScaledInstance(imgF4.getWidth(), imgF4.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(imgF4); 
    
    JLabel imgF5 = new JLabel();
    ImageIcon imagenes5= new ImageIcon("imagenes/presentar.png");
    imgF5.setBounds(1100,865,100,100);
    imgF5.setIcon(new ImageIcon(imagenes5.getImage().getScaledInstance(imgF5.getWidth(), imgF5.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(imgF5);   
} 
private void Botones(){
    boton = new JButton ();
    boton.setBounds(500,865,100,100);
    ImageIcon img=new ImageIcon("imagenes/int.png");
    boton.setIcon(new ImageIcon(img.getImage().getScaledInstance(boton.getWidth()+15,boton.getHeight()+15,Image.SCALE_SMOOTH)));
   // boton.setContentAreaFilled(false);
   boton.setBorder(null);
    fondoP.add(boton);
    boton.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e){
    if(e.getSource()==boton){
        
        ventana.setVisible(true);
    }

 }

}

 