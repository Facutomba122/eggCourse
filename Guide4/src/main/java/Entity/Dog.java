package Entity;

public class Dog {
    String name;
    String race;
    int age;
    double size;

    public Dog() {
    }
    
    
    
    @Override
    public String toString(){
        return "Name: " + this.name + "\n" + "Race: " + this.race + "\n" + "Age: " + this.age + "\n" + "Size:" + this.size;
    }
}
