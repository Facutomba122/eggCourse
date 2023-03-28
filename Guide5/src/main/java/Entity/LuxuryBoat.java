package Entity;

import java.util.Date;

public class LuxuryBoat extends Ship{
    int CV;
    int camarotes;

    public LuxuryBoat() {
        super();
    }

    public LuxuryBoat(int CV, int camarotes, String tuition, int eslora, int fabricationAge) {
        super(tuition, eslora, fabricationAge);
        this.CV = CV;
        this.camarotes = camarotes;
    }
    
    @Override
    public double calculatePrize(int days){
        return (this.getEslora() *10) + this.CV + this.camarotes;
    }
    
}
