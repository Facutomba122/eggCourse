package Entity;

import java.util.Scanner;

public class OfficeBuilding extends Building {
    int officeNumber;
    int amountOfficePerson;
    int amountFloors;

    public OfficeBuilding(int officeNumber, int amountOfficePerson, int amountFloors, double wide, double heigth, double longer) {
        super(wide, heigth, longer);
        this.officeNumber = officeNumber;
        this.amountOfficePerson = amountOfficePerson;
        this.amountFloors = amountFloors;
    }
    
    @Override
    public double calculateVol(){
        return this.heigth * this.wide * this.longer;
    }
    
    @Override
    public double calculateSuf(){
        return (this.wide*2 + this.longer *2 ) * this.heigth; 
    }
    
    public void amountPerson(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nro office: ");
        this.officeNumber = scanner.nextInt();
        System.out.println("Amount Person per office: ");
        this.amountOfficePerson = scanner.nextInt();
        System.out.println("Amount floors: ");
        this.amountFloors = scanner.nextInt();
        
        System.out.println("Total person for a floor: " + this.amountOfficePerson * this.officeNumber);
        System.out.println("Total person for building: " + this.amountOfficePerson * this.officeNumber * this.amountFloors);
    }
    
    
    
}
