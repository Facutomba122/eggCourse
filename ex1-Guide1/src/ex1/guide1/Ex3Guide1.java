package ex1.guide1;
import java.util.Scanner;

public class Ex3Guide1 {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       double age;
       boolean key;
       String aux;
       char a;
       age = input.nextDouble();
       key = input.nextBoolean();
       System.out.println("Ingrese un caracter: ");
       aux = input.next();
       a = aux.charAt(0);
       System.out.println(Double.toString(age) + Boolean.toString(key) + a);
   } 
}
