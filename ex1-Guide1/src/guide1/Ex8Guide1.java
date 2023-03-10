package guide1;
import java.util.Scanner;

public class Ex8Guide1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        for (int counter = 0; counter < 4; counter ++){
            do {
                choice = scanner.nextInt();
            } while (choice < 0 || choice > 20);
            System.out.print(Integer.toString(choice) + " ");
            for (int i=0; i<choice; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
