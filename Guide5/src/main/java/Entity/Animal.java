package Entity;

public class Animal {
    String name;
    String food;
    int age;
    String race;

    public Animal(String name, String food, int age, String race) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.race = race;
    }
    
    
    public void feed(){
        System.out.println("Se alimenta de: " + this.food);
    }
}

