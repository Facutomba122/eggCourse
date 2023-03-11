package guide1;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author facun
 */
public class FinalGuide1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        String text;
        do {
            System.out.println("Ingrese un nro del 1 al  :");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    int numberInput = scanner.nextInt();
                    System.out.println(itsPar(numberInput));
                    break;
                case 2:
                    String text1 = scanner.nextLine();
                    String text2 = scanner.nextLine();
                    System.out.println(equals(text1, text2));
                    break;
                case 3:
                    text = scanner.nextLine();
                    lengthMinor8(text);
                    break;
                case 4:
                    text = scanner.nextLine();
                    firstLetter(text);
                    break;
                case 5:
                    int number  = scanner.nextInt();
                    limitNumber(number);
                    break;
                case 6:
                    rs232();
                    break;
                case 7:
                    
                    
            }
        } while (choice != -1);
    }
    
    public static boolean itsPar(int number){
        return (number % 2 == 0);
    }
    
    public static boolean equals(String text1, String text2){
        return (text1.equals(text2));
    }
    
    public static void lengthMinor8(String text){
        if (text.length() ==  8){
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
    
    public static void firstLetter(String text){
        if (text.charAt(0) == 'A'){
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
    
    public static void limitNumber(int limit){
        int totalSum = 0;
        Scanner scanner = new Scanner(System.in);
        int actualNumber;
        while (totalSum < limit){
            actualNumber = scanner.nextInt();
            totalSum = totalSum + actualNumber;
        }
        System.out.println(totalSum);
    }
    
    public static void rs232(){
        Stack<String> pileRight = new Stack<>();
        Stack<String> pileError = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        while (!inputText.equals("&&&&&")){
            if (inputText.length() == 5 && inputText.charAt(0) == 'X' && inputText.charAt(4) == 'O'){
                pileRight.push(inputText);
            } else {
                pileError.push(inputText);
            }
            inputText = scanner.nextLine();
        }
        System.out.println("La cantidad de datos correcta fue de: " + pileRight.size() + " y la cantidad de datos incorrecta es de: " + pileError.size());
    }
}
