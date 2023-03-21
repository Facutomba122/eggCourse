package Entity;
import Entity.Stir;

public class Player {
    String name;
    boolean wet;
    int ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWet() {
        return wet;
    }

    public void setWet(boolean wet) {
        this.wet = wet;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Player(String name, boolean wet, int ID) {
        this.name = name;
        this.wet = wet;
        this.ID = ID;
    }

    public Player() {
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", wet=" + wet + ", ID=" + ID + '}';
    }

    
    
    
    
    public boolean shoot(Stir myStir){
        this.setWet(myStir.isDead());
        myStir.rotateBarrel();
        return this.isWet();
    }
}
