package Entity;

import java.util.Scanner;

public class Television extends Homeappliances {
    int resolution;
    boolean tuner;

    public Television() {
        super();
    }

    public Television(double prize, double weigth, String color, char energyConsumption ,int resolution, boolean tuner) {
        super(prize,weigth,color,energyConsumption);
        this.resolution = resolution;
        this.tuner = tuner;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isTuner() {
        return tuner;
    }

    public void setTuner(boolean tuner) {
        this.tuner = tuner;
    }

    public void createTV(){
        Scanner scanner = new Scanner(System.in);
        createHomeappliances();
        System.out.println("Resolution: ");
        this.resolution = scanner.nextInt();
        System.out.println("Tuner: ");
        this.tuner = scanner.nextBoolean();
    }
    
    public void finalPrize(){
        double finalPrize = super.finalPrize(this.energyConsumption, this.weigth);
        if (this.resolution > 40){
            finalPrize = finalPrize + finalPrize * 0.3;  
        }
        if(this.tuner){
            finalPrize += 500;
        }
        this.prize = finalPrize; 
    }
    
}
