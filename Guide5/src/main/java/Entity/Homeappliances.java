package Entity;

import java.util.Scanner;


public class Homeappliances {
    double prize;
    double weigth; 
    String color;
    char energyConsumption;

    public Homeappliances(double prize, double weigth, String color, char energyConsumption) {
        this.prize = prize;
        this.weigth = weigth;
        this.color = color;
        this.energyConsumption = energyConsumption;
    }

    public Homeappliances() {
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(char energyConsumption) {
        this.energyConsumption = energyConsumption;
    }
    
    public char checkEnergyConsumption(char letter){
        int initialASCII = (int) 'A';
        int lateASCII = (int)'F';
        if ((int)letter >= initialASCII && (int)letter <= lateASCII){
            return letter;
        } else {
            return 'F';
        }
    }
    
    public String checkColor(String color){
        String auxString = color.toLowerCase();
        if (auxString.equals("blanco") || auxString.equals("azul") || auxString.equals("negro") || auxString.equals("rojo") || auxString.equals("gris")){
            return auxString;
        }
        return "blanco";
    }
    
    public double finalPrize(char homeAppliances, double weigth){
        double finalPrize = 1000;
        switch (homeAppliances){
            case 'A':
                finalPrize += 1000;
                break;
            case 'B':
                finalPrize += 800;
                break;
            case 'C':
                finalPrize += 600;
                break;
            case 'D':
                finalPrize += 500;
                break;
            case 'E':
                finalPrize += 300;
                break;
            case 'F':
                finalPrize += 100;
                break;
            default:
                return 0; 
        }
        if (weigth >= 1 || weigth <= 19){
            return finalPrize + 100;
        }
        if (weigth >= 20 || weigth <= 49){
            return finalPrize + 500;
        }
        if (weigth >= 50 || weigth <= 79){
            return finalPrize + 800;
        }
        return finalPrize + 1000;
    }
    
    public void createHomeappliances(){
        Scanner scanner = new Scanner(System.in);
        Homeappliances auxHomeappliances = new Homeappliances();
        System.out.println("color: ");
        this.color = checkColor(scanner.nextLine());
        System.out.println("Energy consumption");
        this.energyConsumption = checkEnergyConsumption(scanner.nextLine().charAt(0));
        System.out.println("weigth: ");
        this.weigth = scanner.nextDouble();
        this.prize = finalPrize(this.energyConsumption, this.weigth);
    }
}
