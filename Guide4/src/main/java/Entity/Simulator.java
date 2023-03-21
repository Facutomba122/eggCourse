package Entity;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Simulator {
    ArrayList<Integer> totalDNI = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<String> totalFullnames = new ArrayList<>();

    public Simulator() {
    }
  
    @Override
    public String toString() {
        return "Simulator{" + "students=" + students + '}';
    }
    
    public void generateStudents(){
        totalFullnames = generateFullname(10);
        totalDNI = generateDNI(10);
        
        for (int i=0; i<10; i++){
            Student newStudent = new Student(totalFullnames.remove(0),totalDNI.remove(0), 0);
            students.add(newStudent);
        }
    }
    
    
    public ArrayList<String> generateFullname(int q){
        ArrayList<String> students = new ArrayList<>();
        String[] names = {"Fernando", "Rodolfo", "Josue", "Romina", "Antonela", "Fernanda", "SOY"};
        String[] lastnames = {" Fernandez", " Elst", " Juarez", " Perez", " Dominguez", " Paez", " Paz", " Pereyra", " Alba", " PUTO"};
        String fullname;
        
        for (int i=0; i<q; i++){
            fullname = names[(ThreadLocalRandom.current().nextInt(0, 6 + 1))] + lastnames[(ThreadLocalRandom.current().nextInt(0, 9 + 1))];
            students.add(fullname);
        }
        
        return students;
    }
    
    public ArrayList<Integer> generateDNI(int q){
        ArrayList<Integer> totalDNI = new ArrayList<>();
        int DNI; 
        for (int i=0; i<q; i++){
            DNI = (ThreadLocalRandom.current().nextInt(30000000, 50000000 + 1));
            while (totalDNI.contains(DNI)){
                DNI = (ThreadLocalRandom.current().nextInt(30000000, 50000000 + 1));
            }
            totalDNI.add(DNI);
        }
        return totalDNI;
    }
    
}
