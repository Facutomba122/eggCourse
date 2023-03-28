package Store.Persistence;
import Store.Entity.Producto;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductoDaoExt extends DAO {
    
    public void saveProduct(Producto newProducto) throws Exception{
        try {
            if (newProducto == null){
                throw new Exception ("You need a product");
            }
            String query = "INSERT INTO producto codigo, nombre, precio, codigo_fabricante"
                    + "VALUES (" + newProducto.getCode() + " '" + newProducto.getName() +  "' " + newProducto.getPrize() + " " + newProducto.getManufacturerCode() + ");";
            modifyDB(query);
        } catch (Exception e){
            throw e; 
        }
    }
    
    public void updateProduct(Producto newProducto) throws Exception{
        try {
            if (newProducto.getCode() == -1){
                System.out.println("You need a where condition");
            } else {
                String query = "UPDATE producto "
                    + "SET nombre = '" + newProducto.getName() + "', precio = " + newProducto.getPrize() + " , codigo_fabricante= " + newProducto.getManufacturerCode() + " WHERE codigo = " + newProducto.getCode() + ";";
            
                modifyDB(query);
            }
            
        } catch (Exception e){
            throw e;
        }
    }
    
    public void deleteProduct(Producto newProducto) throws Exception{
        try {
            if (newProducto == null){
                System.out.println("you need a product");
            }
            String query = "DELETE FROM producto WHERE codigo = " + newProducto.getCode();
            modifyDB(query);
            
        } catch (Exception e) {
            throw e; 
        }
    }
    
    public ArrayList<Producto> consultProduct(Producto newProducto,String condition) throws Exception{
        try{
            String query = "SELECT ";
            if (newProducto.getCode() != -1){
                query = query + "codigo, ";
            }
            if (newProducto.getName() != null){
                query = query + "nombre, ";
            }
            if (newProducto.getPrize() != -1){
                query = query + "precio, ";
            }
            if (newProducto.getManufacturerCode() != -1){
                query = query + "codigo_fabricante, ";
            }
            query = query.substring(0, query.length()-3);
            
            query = query + " FROM producto";
            if (condition != null){
                query = query + " WHERE " + condition;
            }
            
            consultDB(query);
            return processResult();
        } catch (Exception e){
            throw e;
        }
    }
    
    private ArrayList<Producto> processResult() throws Exception{
        ArrayList<Producto> auxArray = new ArrayList<>();
        ResultSetMetaData metaData = result.getMetaData();
        int countColumns = metaData.getColumnCount();
        
        try {
            
            while (result.next()){
                Producto auxProduct = new Producto();
                
                for (int i=1; i<=countColumns; i++){
                    if (metaData.getColumnName(i).contains("codigo")){
                        auxProduct.setCode(result.getInt(i));
                    } else if (metaData.getColumnName(i).contains("nombre")){
                        auxProduct.setName(result.getString(i));
                    } else if (metaData.getColumnName(i).contains("precio")){
                        auxProduct.setPrize(result.getInt(i));
                    } else if (metaData.getColumnName(i).contains("codigo_fabricante")){
                        auxProduct.setManufacturerCode(result.getInt(i));
                    }
                }
                auxArray.add(auxProduct);
            }
            return auxArray;
        } catch (SQLException e){
            throw e;
        }
    }
}
