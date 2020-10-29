
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import plataform.Conexion;

public class Ingreso{
    
       public boolean existe(String nom){
        boolean exist = false;
        try {
            Connection conex = Conexion.getConexion();
            Statement sta = conex.createStatement();
            ResultSet rs = sta.executeQuery("SELECT Nombres_y_Apellidos FROM Inscritos");
            while (rs.next()){
                if (nom.equals(rs.getString("Nombres_y_Apellidos"))){
                    exist = true;
                }
            }
            }catch (SQLException ex){    
        }
        return exist;
    }
    public void añadir(String nom){
        try {
            if(existe(nom)){
            Connection conex = Conexion.getConexion ();
            Statement sta = conex.createStatement();
            ResultSet rs = sta.executeQuery("INSERT INTO Registro VALUES ('"+ nom+")" );
            }
            }catch (SQLException ex){  
        }
    } 
}