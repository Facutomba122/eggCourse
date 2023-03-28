package Store.persistence;
import java.sql.*;

public class DAO {
    
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/store";
            String user = "root";
            String password  = "Cabezon1245!";
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion con base de datos existosa");
            conn.close();
            
            
        } catch (SQLException e){
            System.out.println("ERROR SQL");
        } catch (ClassNotFoundException e){
            System.out.println("Class found exception" + e.toString());
        }
        
       
    }
    
    
}
