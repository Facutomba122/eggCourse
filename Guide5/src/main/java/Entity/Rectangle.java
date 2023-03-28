package Entity;

public class Rectangle implements Shapes{
    double heigth;
    double base;

    public Rectangle(double heigth, double base) {
        this.heigth = heigth;
        this.base = base;
    }
    
    @Override
    public double calculatePerimeter(){
        return this.base * this.heigth;
    }
    
    @Override
    public double calculateArea(){
        return (this.base + this.heigth) * 2; 
    }
    
}
