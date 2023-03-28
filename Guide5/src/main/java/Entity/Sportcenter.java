package Entity;

public class Sportcenter extends Building {
    String name;
    boolean haveRoof;

    public Sportcenter(String name, boolean haveRoof, double wide, double heigth, double longer) {
        super(wide, heigth, longer);
        this.name = name;
        this.haveRoof = haveRoof;
    }
    
    @Override
    public double calculateVol(){
        return this.heigth * this.wide * this.longer;
    }
    
    @Override
    public double calculateSuf(){
        return (this.wide*2 + this.longer *2 ) * this.heigth; 
    }
    
}
