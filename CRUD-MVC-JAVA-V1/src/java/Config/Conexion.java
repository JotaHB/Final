package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Conexion {
    Connection con;
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ventas?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true&useSSL=false","root","inflames");
            } catch(Exception e){
            System.err.println("Error:"+e);
        }
    }
    public Connection getConnection(){
        return con;
    }
    public static void main(String[] args) {
        Conexion cn = new Conexion();

        Statement st;
        ResultSet rs;

        try {
            st = cn.con.createStatement();
            rs = st.executeQuery("SELECT * FROM tbl_articless");

            while (rs.next()) {
                System.out.println(rs.getString("Id"));
                System.out.println(rs.getString("Dni"));
                System.out.println(rs.getString("Nombre"));
            }
            cn.con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
