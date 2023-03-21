package Entity;

public class Person {

    String name;
    String lastName; 
    int age; 
    int dni;
    Dog myDog = new Dog();

    public Person() {
    }
    
    public void showPerson(){
        System.out.println("Name: " + this.name + "lastName: " + this.lastName + "Dog: ");
        System.out.println(this.myDog);
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Dog getMyDog() {
        return myDog;
    }

    public void setMyDog(Dog myDog) {
        this.myDog = myDog;
    }
    
    
}
