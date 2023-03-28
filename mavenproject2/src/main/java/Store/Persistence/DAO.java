package Store.Persistence;

import java.sql.*;

public abstract class DAO {
    protected Connection con = null;
    protected ResultSet result = null;
    protected Statement query = null;
    
    private final String USER = "root";
    private final String PASSWORD = "Cabezon1245!";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    protected void connectDB() throws ClassNotFoundException, SQLException{
        try{
            Class.forName(DRIVER);
            String urlDB = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSLL=false";
            con = DriverManager.getConnection(urlDB, USER, PASSWORD);
            
            
        } catch (ClassNotFoundException | SQLException e ){
            throw e;
        }
    }
    
    protected void disconectDB() throws Exception{
        try {
            if (result != null){
                result.close();
            }
            if(query != null){
                query.close();
            }
            if (con != null){
                con.close();
            }
        } catch (Exception e){
            throw e;
        }
    }
    
    protected void modifyDB(String sql) throws SQLException, ClassNotFoundException, Exception {
        try {
            connectDB();
            query = con.createStatement();
            query.executeUpdate(sql);
            
        } catch (SQLException | ClassNotFoundException e){
            con.rollback();
            throw e;
        } finally {
            disconectDB();
        }
    }
    
    protected void consultDB(String sql) throws Exception{
        try {
            connectDB();
            query = con.createStatement();
            result = query.executeQuery(sql); 
        } catch (Exception e){
            throw e;
        }
    }
}
