package entity;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class PersonDate {
    String name;
    Date myDate = new Date();
    
    public PersonDate() {
    }

    public PersonDate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMyDate() {
        return myDate;
    }

    public void setMyDate(int year, int month, int day) {
        this.myDate.setYear(year);
        this.myDate.setMonth(month);
        this.myDate.setDate(day);
    }
    
    public Person createPerson(){
        Scanner scanner = new Scanner(System.in);
        Person myPerson = new Person();
        System.out.println("Nombre: ");
        myPerson.name = scanner.nextLine();
        System.out.println("Fecha(yyyy/mm/dd): ");
        String dateString = scanner.nextLine();
        myPerson.setMyDate(Integer.parseInt(dateString.substring(0, 3)), Integer.parseInt(dateString.substring(5, 6)), Integer.parseInt(dateString.substring(8, 9)));
        
        return myPerson;
    }
    
    public int calculateAge(){
        Date actualDate = new Date();
        return actualDate.getYear() - this.myDate.getYear();
    }
    
    public boolean minorThan(int age){
        return this.calculateAge() < age;
    }
    
}
