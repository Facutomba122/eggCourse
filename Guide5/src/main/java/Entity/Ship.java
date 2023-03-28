package Entity;

import java.util.Date;

public class Ship {
    String tuition;
    int eslora;
    int fabricationAge;

    public Ship() {
    }
    
    public Ship(String tuition, int eslora, int fabricationAge) {
        this.tuition = tuition;
        this.eslora = eslora;
        this.fabricationAge = fabricationAge;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getFabricationAge() {
        return fabricationAge;
    }

    public void setFabricationAge(int fabricationAge) {
        this.fabricationAge = fabricationAge;
    }
    
    public double calculatePrize(int days){
        return days * (this.getEslora() * 10);
    }
}
