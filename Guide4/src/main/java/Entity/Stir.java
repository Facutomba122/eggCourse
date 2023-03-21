package Entity;

import java.util.concurrent.ThreadLocalRandom;

public class Stir {
    int currentPos;
    int deathPos;
    
    public int getCurrentPos() {
        return currentPos;
    }

    public void setCurrentPos(int currentPos) {
        this.currentPos = currentPos;
    }

    public int getDeathPos() {
        return deathPos;
    }

    public void setDeathPos(int deathPos) {
        this.deathPos = deathPos;
    }
    
    public Stir(){}
    
    public void fillStir(){
        this.deathPos = (ThreadLocalRandom.current().nextInt(0, 6 + 1));
        this.currentPos = (ThreadLocalRandom.current().nextInt(0, 6 + 1));
    } 
    
    public boolean isDead(){
        return (this.deathPos == this.currentPos);
    }
    
    public void rotateBarrel(){
        if (this.getCurrentPos() == 6){
            this.setCurrentPos(0);
        } else {
            this.setCurrentPos(this.getCurrentPos() + 1);
        }
    }
    
    @Override
    public String toString(){
        return "Current position is: " + this.getCurrentPos() + "\n" + "Death position is: " + this.getDeathPos();
    }
    
    
}
