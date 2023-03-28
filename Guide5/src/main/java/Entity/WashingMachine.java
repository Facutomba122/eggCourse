package Entity;

import java.util.Scanner;

public class WashingMachine extends Homeappliances{

    int load;

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
    
    
    public WashingMachine() {
        super();
    }

    public WashingMachine(int prize, double weigth, String color, char energyConsumption,int load) {
        super(prize, weigth, color, energyConsumption);
        this.load = load;
    }
    
    public void createWashingMachine(){
        Scanner scanner = new Scanner(System.in);
        createHomeappliances();
        System.out.println("load: ");
        this.load = scanner.nextInt();
    }
    
    public void finalPrize(){
        double finalPrize = super.finalPrize(this.energyConsumption, this.weigth);
        if (this.load > 30){
            this.prize = finalPrize + 500; 
        }
        this.prize = finalPrize;
    }
}
