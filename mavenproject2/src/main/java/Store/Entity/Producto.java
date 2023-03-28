package Store.Entity;

public class Producto {
    private int code;
    private String name;
    private double prize;
    private int manufacturerCode;

    public Producto() {
    }

    public Producto(int code, String name, double prize, int manufacturerCode) {
        this.code = code;
        this.name = name;
        this.prize = prize;
        this.manufacturerCode = manufacturerCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public int getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(int manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }
    
    
}
