package guide1;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class Ex9Guide1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();
        String auxString = "";
        char actualChar;
        
        int length = stringInput.length();
        for (int i=0; i < length; i++){
            actualChar = stringInput.charAt(i);
            auxString = auxString + codificator(actualChar);
        } 
        System.out.println(auxString);
    }
    
    public static char codificator(char charInput){ 
        switch (charInput){
            case ('a'):
                return '@';
            case ('e'):
                return '#';
            case ('i'):
                return '$';
            case ('o'):
                return '%';
            case ('u'):
                return '*';       
            default:
                return charInput;
        }
    }
}
