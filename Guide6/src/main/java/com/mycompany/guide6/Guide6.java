package com.mycompany.guide6;

import Entity.claseArrayOut;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Guide6 {

    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 500 + 1);
        int choice = 0;
        int counter=0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("random number: " + randomNumber);
        
        while (choice != randomNumber){
            try {
                System.out.println("Intenta adivinarlo: ");
                choice = scanner.nextInt();
            } catch (InputMismatchException exception){
                System.out.println("Input mistmatch");
                break;
            }
            finally {
                counter++;
            }
        }
        System.out.println("Counter try's: " + counter);
    }
}
