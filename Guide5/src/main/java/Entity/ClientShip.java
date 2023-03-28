package Entity;

import java.util.Scanner;


public class ClientShip {
    String name;
    String positionAmarre;
    int DNI;
    int daysOccupy;
    Ship shipOcuppied;
    
    
    public ClientShip() {
        this.createClient();
    }
    
    public final void createClient(){
        Scanner scanner = new Scanner(System.in);
        String occupyShip;
        
        System.out.println("Name: ");
        this.name = scanner.nextLine();
        System.out.println("Position: ");
        this.positionAmarre = scanner.nextLine();
        System.out.println("Days occupy: ");
        this.daysOccupy = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Occupy ship: ");
        occupyShip = scanner.nextLine();
        switch (occupyShip.toLowerCase()){
            case "velero":
                this.shipOcuppied = new Sailboat("Alfa", 8, 1998, 2);
                break;
            case "yate":
                this.shipOcuppied = new LuxuryBoat(25,5,"Beta", 15, 2004);
                break;
            case "motor":
                this.shipOcuppied = new MotorBoat(50,"Gamma",12, 2005);
                break;
            default:
                this.shipOcuppied = new Ship("Omega", 30, 1950);
                break;
        }
    }
    
    public double calculatePrize(){
        double totalPay;
        totalPay = this.shipOcuppied.calculatePrize(this.daysOccupy);
        System.out.println("total pay: " + totalPay);
        
        return totalPay;
    }
}
