package entity;

import java.util.Scanner;


public class SecretMonth {
    public String[] months = new String[12];
    private String secretMonth;
    Scanner scanner = new Scanner(System.in);
    
    public SecretMonth() {
        this.months[0] = "january";
        this.months[1] = "february";
        this.months[2] = "march";
        this.months[3] = "april";
        this.months[4] = "may";
        this.months[5] = "june";
        this.months[6] = "july";
        this.months[7] = "august";
        this.months[8] = "september";
        this.months[9] = "october";
        this.months[10] = "november";
        this.months[11] = "december";
        int randomNumber = (int)(Math.random() * 11);
        this.secretMonth = this.months[randomNumber];
        
    }
    
    public String getSecretMonth() {
        return secretMonth;
    }
    
    public boolean main(){
        String inputUser;
        
        System.out.println("Adivina el mes secreto: ");
        inputUser = scanner.nextLine();
        return inputUser.equals(this.getSecretMonth());
    }
}
