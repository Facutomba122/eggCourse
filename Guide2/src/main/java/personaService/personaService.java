package personaService;
import entity.Persona;
import java.util.Scanner;


public class personaService {
    private static Scanner scanner = new Scanner(System.in);
    
    
    public static Persona createPersona(){
        Persona newPerson = new Persona();
        int actualYear = 2023;
        int birthYear;
        
        System.out.println("Ingrese nombre completo: ");
        newPerson.setFullname(scanner.nextLine());
        System.out.println("Ingrese direccion: ");
        newPerson.setAddress(scanner.nextLine());
        System.out.println("Ingrese fecha de nacimiento (DD/MM/AA): ");
        newPerson.setAddress(scanner.nextLine());
        
        birthYear = Integer.parseInt(newPerson.getBirthDate().substring(5,7));
        newPerson.setAge(actualYear - birthYear);
        return newPerson;
    }
}
