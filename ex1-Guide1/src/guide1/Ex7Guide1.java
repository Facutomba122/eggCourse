package guide1;
import java.util.Scanner;

public class Ex7Guide1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        int counter = 0;
        int totalSum = 0;
        
        do {
            choice = scanner.nextInt();
            if (choice == 0){
                System.out.println("Se capturo el numero 0");
                break;
            }
            if (choice > 0){
                totalSum += choice;
            }
            counter++;
        } while (counter <= 20);
        System.out.println("El total sumado es de: " + Integer.toString(totalSum));
    }
}
