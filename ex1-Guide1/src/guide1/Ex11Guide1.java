package guide1;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class Ex11Guide1 {
    public static void main(String[] args){
        String[] buddy = new String[5];
        Scanner scanner = new Scanner(System.in);
        
        for (int i=0; i<5; i++){
            buddy[i] = scanner.nextLine();  
            System.out.println(buddy[i]);
        }
    }
}
