package Service;

import Entity.Student;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentService {
    
    
    public static ArrayList<Student>  createStudent(){
        String choice;
        String choice2;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        LinkedList<Double> inputGrades = new LinkedList<>();
        
        do {
            System.out.println("Desea ingrese un alumno nuevo? (Y/N)");
            choice = scanner.nextLine();
            if (!choice.equals("N")){
                Student newStudent = new Student();
                newStudent.setName(scanner.nextLine());
                System.out.println("Ingrese notas, N para no ingresar");
                choice2 = scanner.nextLine();
                
                while (!choice2.equals("N")){
                    System.out.println("Ingrese nota: ");
                    inputGrades.add(scanner.nextDouble());
                    System.out.println("Desea continuar? N para salir");
                    choice2 = scanner.nextLine();
                }
                newStudent.setGrades(inputGrades);
                
                
                
                students.add(newStudent);
            }
        } while(!choice.equals("N"));
        
        return students;
    }  
}
