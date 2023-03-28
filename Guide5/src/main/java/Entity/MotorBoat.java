package Entity;

import java.util.Date;

public class MotorBoat extends Ship{
    int CV;

    public MotorBoat(int CV, String tuition, int eslora, int fabricationAge) {
        super(tuition, eslora, fabricationAge);
        this.CV = CV;
    }

    public MotorBoat() {
        super();
    }
    
    @Override
    public double calculatePrize(int days){
        return (this.getEslora()*10)+this.CV;
    }
    
    
}
