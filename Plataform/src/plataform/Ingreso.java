package plataform;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import plataform.Conexion;

public class Ingreso{
    
       public boolean existeInscrito(String nom){
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
       
       private boolean existeParticipante(String nom){
        boolean exist = false;
        try {
            Connection conex = Conexion.getConexion();
            Statement sta = conex.createStatement();
            ResultSet rs = sta.executeQuery("SELECT nomParticipante FROM Participantes");
            while (rs.next()){
                if (nom.equals(rs.getString("nomParticipante"))){
                    exist = true;
                }
            }
            }catch (SQLException ex){    
        }
        return exist;
    }
       
    public void añadir(String nom){
        try {
            if(!existeParticipante(nom)){
            Connection conex = Conexion.getConexion ();
            Statement sta = conex.createStatement();
            int codigo = getCodigo(nom);
            ResultSet rs = sta.executeQuery("INSERT INTO Participantes VALUES (" +codigo+",'"+ nom+"')" );
            }
            }catch (SQLException ex){  
        }
    } 
    
    private int getCodigo (String nom){
         int codigo=0;
        try {
            Connection conex = Conexion.getConexion ();
            Statement sta = conex.createStatement();
            ResultSet rs = sta.executeQuery("SELECT id from Inscritos where Nombres_y_Apellidos = '"+ nom+"'");
                codigo = rs.getInt("id");
            }catch (SQLException ex){  
            }
         return codigo;
    }
}