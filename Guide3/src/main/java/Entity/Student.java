package Entity;

import java.util.LinkedList;

public class Student {
    String name;
    LinkedList<Double> grades = new LinkedList<>();
    
    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(LinkedList<Double> grades) {
        this.grades = grades; 
    }

    public String getName() {
        return name;
    }

    public LinkedList<Double> getGrades() {
        return grades;
    }
    
    
    
}
