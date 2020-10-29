
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
    //VentanaParticipante vp= new VentanaParticipante();
    
    
    
    /* 
    JLabel mensajes;
    private JButton ingresar;
    private final JFrame ventana;
    VenPrincipal vp = new VenPrincipal();
    JTextField caja;
   **/ 
   public Inicio (){
       
       this.setSize(500,500);
       setTitle("PlataForm");
       setLocationRelativeTo(null);
       this.setResizable(false);
       
        panel = new JPanel();   
        this.getContentPane().add(panel);
        imagenes();
        fondo();
        caja();
        botonIngresar();
        
        panel.setLayout(null);
      
       
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       
      /*  ventana = new JFrame("PlataForm");
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
       **/   

}
   /*
   private void botones(){
    ingresar = new JButton("Ingresar Reunion");
    ingresar.setVisible(true);
    ingresar.setBounds(200, 275, 200, 25);
    ingresar.setIcon(new ImageIcon("boton1.png"));
    ingresar.setContentAreaFilled(false);
    ingresar.setBorder(null);
    ventana.add(ingresar);
    ingresar.addActionListener(this);
    
   }
   
   private void cajas(){
    caja = new JTextField();
    caja.setVisible(true);
    caja.setBounds (175, 225, 250, 30);
    ventana.add(caja);
   }
   
   @Override
     public void actionPerformed(ActionEvent e){
       if(e.getSource()==ingresar){
        
        vp.setVisible(true);
      }

    }
   **/

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
    // boton.setContentAreaFilled(false);
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
   
   
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==boton){
                vp.setVisible(true);
               System.out.println(caja.getText());
       }
    }
   
}