package Store.Services;
import Store.Entity.Producto;


public class Service {
    public void listarProductos(){
        Producto productoQuery = new Producto();
        productoQuery.setCode(0);
        productoQuery.setManufacturerCode(0);
        productoQuery.setName("Alejandro");
        productoQuery.setPrize(0);
        
        
    }
}
