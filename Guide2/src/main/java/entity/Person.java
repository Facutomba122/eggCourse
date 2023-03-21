package entity;
import java.util.Scanner;

public class Person {
    public String name;
    public int age;
    public char genre;
    public double weigth;
    public double heigth;
    Scanner scanner = new Scanner(System.in);

    public Person(String name, int age, char genre, double weigth, double heigth) {
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.weigth = weigth;
        this.heigth = heigth;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    
    public boolean createPerson(){
        System.out.println("Nombre");
        setName(scanner.nextLine());
        System.out.println("Ingrese genero");
        char inputGenre = scanner.next().charAt(0);        
        while (inputGenre != 'H' && inputGenre != 'M' && inputGenre != 'O'){
            System.out.println("error, ingrese genero");
            inputGenre = scanner.next().charAt(0); 
        }
        setGenre(inputGenre);
        System.out.println("altura");
        setHeigth(scanner.nextDouble());
        System.out.println("peso");
        setWeigth(scanner.nextDouble());
        System.out.println("edad");
        setAge(scanner.nextInt());
        return true;
    }
    
    public int calculateIMC(){
        double imc = this.weigth/Math.pow(this.heigth, 2);
        if (imc < 20){
            return (-1);
        } else if(imc > 20 && imc < 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public boolean legalAge(){
        return this.age >= 18;
    }
    
    
}

