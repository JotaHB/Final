package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements CRUD{
    Conexion cn = new Conexion();
    Connection con = cn.getConnection();
    Statement st;
    ResultSet rs;
    
    @Override
    public List<Persona> listar(){
        List<Persona> list = new ArrayList<>();
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM persona");
            System.out.println("Query ejecutada");
            while (rs.next()) {
                Persona per = new Persona();
                per.setId(rs.getInt("id"));
                per.setDni(rs.getString("dni"));
                per.setNom(rs.getString("nom"));
                list.add(per);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return list;
    }

    @Override
    public Persona list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(Persona per) {
        String sql = "INSERT INTO persona(DNI, Nom) VALUES ('" + per.getDni() + "', '" + per.getNom() + "')";
        try {
            con = cn.getConnection();
            st = con.createStatement(); // Cambiar a createStatement() en lugar de prepareStatement()
            st.executeUpdate(sql); // Ejecutar el comando SQL
            return true; // Retorna verdadero si se ejecuta correctamente
        } catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }


    @Override
    public boolean edit(Persona per) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
        