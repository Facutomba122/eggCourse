package guide1;
import java.util.Scanner;

public class Ex6Guide1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int note = scanner.nextInt();
        while (note > 10 || note < 0){
            System.out.println("La nota debe ser menor a 10 y mayor a 0");
            note = scanner.nextInt();
        }
    }
}
