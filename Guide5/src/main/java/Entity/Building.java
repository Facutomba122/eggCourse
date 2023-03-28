package Entity;

public abstract class Building {
    public double wide;
    public double heigth;
    public double longer; 

    public Building(double wide, double heigth, double longer) {
        this.wide = wide;
        this.heigth = heigth;
        this.longer = longer;
    }
    
    
    
    public abstract double calculateVol();
    
    public abstract double calculateSuf();
    
    
}
