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

public class VenPrincipal extends JFrame implements ActionListener   {
    JPanel fondoP;
    JButton botonsalir;
    JButton boton ;
    Inicio ini ;
    VentanaParticipante vp;
    String nomPart;
    Ingreso ing;
    
    public VenPrincipal(){
    this.setSize(1500,750);
    setTitle("PlataForm");
    setLocationRelativeTo(null);
    this.setResizable(false);
     fondoP= new JPanel();   
    this.getContentPane().add(fondoP);
    fondoP.setLayout(null);
    botonsalir();
    imagen();
     fondoPrin();
     Botones();
    
    Toolkit logo= Toolkit.getDefaultToolkit();
    Image miLogo = logo.getImage("Imagenes/pf3.png");
    setIconImage(miLogo);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
private void fondoPrin(){
    JLabel imgF = new JLabel();
    ImageIcon imagenes= new ImageIcon("Imagenes/naranja.png");
    imgF.setBounds(0,600,1900,130);
    imgF.setIcon(new ImageIcon(imagenes.getImage().getScaledInstance(imgF.getWidth(), imgF.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(imgF);
    
    JLabel imgFondo = new JLabel();
    ImageIcon imagen= new ImageIcon("imagenes/negro.png");
    imgFondo.setBounds(0,0,1500,730);
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
    imgF.setBounds(200,610,100,100);
    imgF.setIcon(new ImageIcon(imagenes.getImage().getScaledInstance(imgF.getWidth(), imgF.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(imgF);
    
    JLabel img1 = new JLabel();
    ImageIcon imagenes1= new ImageIcon("imagenes/chat.png");
    img1.setBounds(350,610,100,100);
    img1.setIcon(new ImageIcon(imagenes1.getImage().getScaledInstance(img1.getWidth(), img1.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(img1);

    JLabel imgF3 = new JLabel();
    ImageIcon imagenes3= new ImageIcon("imagenes/microfono.png");
    imgF3.setBounds(800,610,100,100);
    imgF3.setIcon(new ImageIcon(imagenes3.getImage().getScaledInstance(imgF3.getWidth(), imgF3.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(imgF3);

    JLabel imgF4 = new JLabel();
    ImageIcon imagenes4= new ImageIcon("imagenes/video.png");
    imgF4.setBounds(950,610,100,100);
    imgF4.setIcon(new ImageIcon(imagenes4.getImage().getScaledInstance(imgF4.getWidth(), imgF4.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(imgF4); 
    
    JLabel imgF5 = new JLabel();
    ImageIcon imagenes5= new ImageIcon("imagenes/presentar.png");
    imgF5.setBounds(1100,610,100,100);
    imgF5.setIcon(new ImageIcon(imagenes5.getImage().getScaledInstance(imgF5.getWidth(), imgF5.getHeight(),Image.SCALE_SMOOTH )));
    fondoP.add(imgF5);   
    
} 
private void Botones(){
    boton = new JButton ();
    boton.setBounds(500,610,100,100);
    ImageIcon img=new ImageIcon("imagenes/int.png");
    boton.setIcon(new ImageIcon(img.getImage().getScaledInstance(boton.getWidth()+15,boton.getHeight()+15,Image.SCALE_SMOOTH)));
    boton.setBorder(null);
    fondoP.add(boton);
    boton.addActionListener(this);
}
private void botonsalir()
{
    botonsalir = new JButton ();
    botonsalir.setBounds(650,610,100,100);
    ImageIcon img1=new ImageIcon("imagenes/salir.png");
    botonsalir.setIcon(new ImageIcon(img1.getImage().getScaledInstance(botonsalir.getWidth()+15,botonsalir.getHeight()+15,Image.SCALE_SMOOTH)));
    botonsalir.setBorder(null);
    fondoP.add(botonsalir);
    botonsalir.addActionListener(this);

}
public void setPart(String nom){
    nomPart=nom;
}
@Override
public void actionPerformed(ActionEvent e){
    if(e.getSource()==boton){
        vp= new VentanaParticipante();
        vp.setVisible(true);
    }
     if(e.getSource()==botonsalir){
         ing = new Ingreso();
         ing.eliminar(nomPart);
         ini = new Inicio();
        ini.setVisible(true);
        dispose();
        vp.setVisible(false);
     }
   }
}

 