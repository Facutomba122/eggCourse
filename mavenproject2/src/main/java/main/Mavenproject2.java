package main;
import Store.Persistence.FabricanteDaoExt;
import Store.Entity.Fabricante;


public class Mavenproject2 {

    public static void main(String[] args) throws Exception {
        Fabricante newFabricante = new Fabricante();
        FabricanteDaoExt fabricanteDAO = new FabricanteDaoExt();
        
        newFabricante.setName("Lorenzzi");
        newFabricante.setCode(10);
        fabricanteDAO.saveFabricante(newFabricante);
        
    }
}
