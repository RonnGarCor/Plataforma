
package plataform;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Inicio extends JFrame implements ActionListener{   
    JPanel panel;
    JButton boton ;
    JTextField caja ;
    VenPrincipal vp= new VenPrincipal();
    String nomUsuario;
    public Inicio (){
       
       this.setSize(500,500);
       setTitle("PlataForm");
       setLocationRelativeTo(null);
       this.setResizable(false);
       panel = new JPanel();   
       this.getContentPane().add(panel);
       botonIngresar();
       imagenes();
       fondo();    
       caja();
        panel.setLayout(null);
      
       Toolkit logo= Toolkit.getDefaultToolkit();
       Image miLogo = logo.getImage("Imagenes/pf3.png");
       setIconImage(miLogo);
       setVisible(true);
        
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
}
  public void fondo()
   {
       JLabel imgF = new JLabel();
       ImageIcon imagenes= new ImageIcon("Imagenes/negro.png");
       imgF.setBounds(0,0,500,500);
       imgF.setIcon(new ImageIcon(imagenes.getImage().getScaledInstance(imgF.getWidth(), imgF.getHeight(),Image.SCALE_SMOOTH )));
       panel.add(imgF);
   }
   
   public void imagenes()
   {
       JLabel imgF = new JLabel();
       ImageIcon imagen1= new ImageIcon("Imagenes/logo.png");
       imgF.setBounds(185,100,100,100);
       imgF.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(imgF.getWidth(), imgF.getHeight(),Image.SCALE_SMOOTH )));
       panel.add(imgF);
       
       JLabel plataform = new JLabel();
       ImageIcon imagen2= new ImageIcon("Imagenes/plataform.png");
       plataform.setBounds(165,20,155,100);
       plataform.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(plataform.getWidth(), plataform.getHeight(),Image.SCALE_SMOOTH )));
       panel.add(plataform);
        
   }
   
   private void botonIngresar(){
    boton = new JButton ();
    boton.setBounds(140,320,200,30);
    ImageIcon img=new ImageIcon("imagenes/boton1.png");
    boton.setIcon(new ImageIcon(img.getImage().getScaledInstance(boton.getWidth()+15,boton.getHeight()+15,Image.SCALE_SMOOTH)));
    boton.setBorder(null);
    panel.add(boton);
    boton.addActionListener(this);
    }
   
   private void caja()
   {
        caja = new JTextField();
        caja.setVisible(true);
        caja.setBounds (120, 240, 250, 30);
           panel.add(caja);
           System.out.println(caja.getText());
       
   }
   
    private void emergencia(){
       JFrame ven = new JFrame("ERROR");
        ven.setSize(418,120);
        ven.setLocationRelativeTo(null);
        ven.setResizable(false);
        ven.setVisible(true);
        JLabel imgF = new JLabel();
        ImageIcon imagenes= new ImageIcon("Imagenes/noregistro.png");
        imgF.setBounds(0,0,400,117);
        imgF.setIcon(new ImageIcon(imagenes.getImage().getScaledInstance(imgF.getWidth(), imgF.getHeight(),Image.SCALE_SMOOTH )));
        ven.add(imgF);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==boton){
           Ingreso ingreso = new Ingreso ();
           String nom = caja.getText().toUpperCase();
           if (ingreso.existeInscrito(nom)){
               vp.setPart(nom);
               ingreso.añadir(nom);
               vp.setVisible (true);
               setVisible (false);
           }else{
             emergencia();
           }    
       }
    }
   
}