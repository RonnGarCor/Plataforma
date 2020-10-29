
package plataform;


import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
public class Inicio extends JFrame 
{   
    JLabel mensajes;
    private JButton ingresar;
    private final JFrame ventana;
    JTextField caja;
   public Inicio (){
        ventana = new JFrame("PlataForm");
        setLocationRelativeTo (null);
        ventana.setLayout(null);
        ventana.setLocation(500,200);
        ventana.setResizable(false);
        ventana.setSize(600,400);
        ventana.setVisible(true);
        ventana.getContentPane().setBackground(Color.gray);
        //ventana.setContentPane(new JLabel(new ImageIcon("fondo.png")));
        JLabel titulo = new JLabel();
        titulo.setVisible(true);
        titulo.setIcon(new ImageIcon("Imagenes/plataform2.png"));
        ventana.add(titulo);
        titulo.setBounds(0, 0, 400,100);
       
        JLabel subfondo = new JLabel();
        subfondo.setVisible(true);
        subfondo.setIcon(new ImageIcon("Imagenes/subfondo.png"));
        ventana.add(subfondo);
        subfondo.setBounds(0, 0, 600,75);
        
        JLabel perfil = new JLabel();
        perfil.setVisible(true);
        perfil.setIcon(new ImageIcon("Imagenes/perfil.png"));
        ventana.add(perfil);
        perfil.setBounds(250, 100, 100,100);
        
        
         JLabel imgF = new JLabel();
          ImageIcon imagenes= new ImageIcon("imagenes/fondo.png");
    imgF.setBounds(500,200,600,400);
    imgF.setIcon(new ImageIcon(imagenes.getImage().getScaledInstance(imgF.getWidth(), imgF.getHeight(),Image.SCALE_SMOOTH )));
    ventana.add(imgF);
        
        botones();
        cajas();
        
        setDefaultCloseOperation (EXIT_ON_CLOSE);
   }
   private void botones(){
    ingresar = new JButton("Ingresar Reunion");
    ingresar.setVisible(true);
    ingresar.setBounds(200, 275, 200, 25);
    ingresar.setIcon(new ImageIcon("boton1.png"));
    ingresar.setContentAreaFilled(false);
    ingresar.setBorder(null);
    ventana.add(ingresar);
    
   }
   
   private void cajas(){
    caja = new JTextField();
    caja.setVisible(true);
    caja.setBounds (175, 225, 250, 30);
    ventana.add(caja);
   }
   
}