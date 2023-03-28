package Entity;
import java.util.Date;


public class Sailboat extends Ship {
    int totalMast;

    public Sailboat(String tuition, int eslora, int fabricationAge,int totalMast) {
        super(tuition, eslora, fabricationAge);
        this.totalMast = totalMast;
    }

    public Sailboat() {
        super();
    }

    public int getTotalMast() {
        return totalMast;
    }

    public void setTotalMast(int totalMast) {
        this.totalMast = totalMast;
    }
    
    @Override
    public double calculatePrize(int days){
        return (this.getEslora() *10)+this.totalMast;
    }
    
    
}
