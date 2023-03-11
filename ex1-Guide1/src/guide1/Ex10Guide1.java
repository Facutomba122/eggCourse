package guide1;
import java.util.Scanner;


/**
 *
 * @author facun
 */
public class Ex10Guide1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputNum1 = scanner.nextInt();
        int inputNum2 = scanner.nextInt();
        System.out.println(itsMultiple(inputNum1, inputNum2));
        
    }
    
    public static boolean itsMultiple(int num1,int num2){
        if (num1 > num2){
            return (num1 % num2 == 0);
        } else if (num2 > num1) {
            return (num2 % num1 == 0);
        } else {
            return true;
        }
    }
}
