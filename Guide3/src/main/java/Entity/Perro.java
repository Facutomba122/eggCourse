package Entity;

public class Perro {
    String nameRace;
    
    @Override
    public String toString(){
        return "Raza: " + this.nameRace;
    }

    public Perro() {
    }

    public void setNameRace(String nameRace) {
        this.nameRace = nameRace;
    }

    public String getNameRace() {
        return nameRace;
    }
    
    /* ArrayList<Perro> dogArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String choice;
        Iterator<Perro> iterator = dogArray.iterator();
        
        do {
            System.out.println("Agregue otra raza, N para salir");
            choice = scanner.nextLine();
            if (!choice.equals("N")){
                Perro newDog = new Perro();
                newDog.setNameRace(choice);
                dogArray.add(newDog);
            }
        } while (!choice.equals("N"));
        
        System.out.println("Ingrese el nombre de la raza que desea eliminar: ");
        choice = scanner.nextLine();
        
        while (iterator.hasNext()){
           Perro auxDog = iterator.next();
           if (auxDog.getNameRace().equals(choice)){
               iterator.remove();
           }
        }
        
        for (Perro auxDog2 : dogArray){
            System.out.println(auxDog2);
        } 
    */
}
