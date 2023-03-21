package Entity;

public class Spectator {
    String name;
    int age;
    double money;
    
    public Spectator() {
    }
    
    public boolean isLegal(int ageRequired){
        return this.age >= ageRequired;
    }
    
    public boolean enoughMoney(double moneyRequired){
        return this.money >= moneyRequired;
    }
}
