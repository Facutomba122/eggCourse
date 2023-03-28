package Entity;

public class Circle implements Shapes {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculatePerimeter(){
        return 2*PI*this.radius;
    }
    
    @Override
    public double calculateArea(){
        return PI*Math.pow(this.radius, 2);
    }
}
