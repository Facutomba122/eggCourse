package main;
import Store.Persistence.FabricanteDaoExt;
import Store.Entity.Fabricante;
import java.util.ArrayList;


public class Mavenproject2 {

    public static void main(String[] args) throws Exception {
        Fabricante newFabricante = new Fabricante();
        FabricanteDaoExt fabricanteDAO = new FabricanteDaoExt();
        ArrayList<Fabricante> arrayFabricante = new ArrayList<>();
        
        newFabricante.setCode(10);
        newFabricante.setName("Lorenzzzi");
        
        fabricanteDAO.deleteFabricante(newFabricante);
        arrayFabricante = fabricanteDAO.consultFabricante(newFabricante, "nombre = 'Lorenzzzi'");        
        
        for(Fabricante auxFabricante : arrayFabricante){
            System.out.println("Codigo: ");
            System.out.println(auxFabricante.getCode());
            System.out.println("Nombre: ");
            System.out.println(auxFabricante.getName());
            System.out.println();
        }
    }
}
