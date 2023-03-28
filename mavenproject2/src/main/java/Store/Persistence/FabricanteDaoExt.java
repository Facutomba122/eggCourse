package Store.Persistence;
import Store.Entity.Fabricante;

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
    
    public void consultFabricante(Fabricante newFabricante, String condition) throws Exception{
        try {
            String query = "SELECT (";
            if(newFabricante.getCode() != -1){
                query = query + "codigo, ";
            }
            if (newFabricante.getName() != null){
                query = query + "nombre)";
            }
            query = query + " from fabricante WHERE " + condition;

            consultDB(query);
        } catch (Exception e){
            throw e;
        }
        
    }
}
