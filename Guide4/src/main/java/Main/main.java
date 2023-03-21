package Main;

import Entity.Simulator;
import Entity.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
       Simulator mySimulator = new Simulator();
       
       mySimulator.generateStudents();
       System.out.println(mySimulator);
    }
    
    
    
}
