package guide1;
import java.util.Scanner;

public class Ex4Guide1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        
        if (num1 > 25 || num2 > 25){
            System.out.println("Alguno de los numeros es mayor a 25");
        } else {
            System.out.println("Ningún numero es mayor a 25.");
        }
    };
};
