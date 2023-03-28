package Store.Persistence;
import Store.Entity.Fabricante;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public final class FabricanteDaoExt extends DAO{
    
    public void saveFabricante(Fabricante newFabricante) throws Exception{
        try {
            if (newFabricante == null){
                throw new Exception ("Necesitas un fabricante");
            }
            
            String sql = "INSERT INTO Fabricante (nombre)" 
                    + "VALUES ('" + newFabricante.getName() + "');";
            modifyDB(sql);
        } catch (Exception e){
            throw e; 
        }
    }
    
    public void modifyFabricante(Fabricante newFabricante) throws Exception{
        try {
            if (newFabricante == null){
                throw new Exception ("Need fabricante");
            }
            String sql = "UPDATE fabricante SET " 
                    + "nombre = '" + newFabricante.getName() + "' WHERE codigo = " + newFabricante.getCode() + ";";
            
            modifyDB(sql);
            
        } catch (Exception e){
            throw e;
        }
    }
    
    public void deleteFabricante(Fabricante newFabricante) throws Exception {
        try {
            if (newFabricante == null){
                throw new Exception ("Error in fabricante");
            }
            if (newFabricante.getCode() < 0 ){
                throw new Exception ("Error in codigo fabricante");
            }
            
            String sql = "DELETE FROM fabricante WHERE codigo = " + newFabricante.getCode();
            modifyDB(sql);
        } catch (Exception e){
            throw e;
        }
    }
    
    public ArrayList<Fabricante> consultFabricante(Fabricante newFabricante, String condition) throws Exception{
        try {
            String query = "SELECT ";
            if(newFabricante.getCode() != -1){
                query = query + "codigo, ";
            }
            if (newFabricante.getName() != null){
                query = query + "nombre, ";
            }
            query = query.substring(0, query.length()-3);
            
            query = query + " FROM fabricante";
            if(condition != null){
                query = query + " WHERE " + condition;
            }
            
            consultDB(query);
            return processResult();
            
            
        } catch (Exception e){
            throw e;
        }
    }
    
    private ArrayList<Fabricante> processResult() throws SQLException{
        
        ArrayList<Fabricante> auxArray = new ArrayList<>();
        ResultSetMetaData metaData = result.getMetaData();
        int countColumns = metaData.getColumnCount();

        try {
            while(result.next()){
               Fabricante auxFabricante = new Fabricante();

               for (int i=1; i<=countColumns; i++){
                   if (metaData.getColumnName(i).contains("codigo")){
                       auxFabricante.setCode(result.getInt(i));
                   } else if (metaData.getColumnName(i).contains("nombre")){
                       auxFabricante.setName(result.getString(i));
                   }
               }

               auxArray.add(auxFabricante);
            }
            return auxArray;
        } catch (SQLException e){
            throw e;
        }
    }
}
