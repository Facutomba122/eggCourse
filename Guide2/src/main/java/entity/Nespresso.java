package entity;

public class Nespresso {
    public double maxAbility;
    public double actualAbility;
    
    public void Nespresso(){
        
    }
    
    public void Nespresso(double maxAbility, double actualAbility){
        this.maxAbility = maxAbility;
        this.actualAbility = actualAbility;
    }

    public double getMaxAbility() {
        return maxAbility;
    }

    public void setMaxAbility(double maxAbility) {
        this.maxAbility = maxAbility;
    }

    public double getActualAbility() {
        return actualAbility;
    }

    public void setActualAbility(double actualAbility) {
        this.actualAbility = actualAbility;
    }
    
    public void fillCoffemaker(){
        this.actualAbility = this.maxAbility;
    }
    
    public void serverCup(double cupCapacity){
        if (this.actualAbility< cupCapacity){
            cupCapacity = this.actualAbility;
            this.actualAbility = 0;
            System.out.println("La taza de cafe no alcanzo a llenarse, contiene " + cupCapacity);
        } else {
            this.actualAbility -= cupCapacity;
        }
    }
    
    public void emptyCoffeemaker(){
        this.actualAbility = 0;
    }
    
    public void addCoffee(double amountCoffee){
        if (this.actualAbility + amountCoffee > this.maxAbility){
            double spare = (this.actualAbility + amountCoffee) * this.maxAbility;
            this.actualAbility = this.maxAbility;
            System.out.println("Se excedio la capacidad maxima en un total de: " + spare);
        } else {
            this.actualAbility += amountCoffee;
        }
    }
    
    
}
