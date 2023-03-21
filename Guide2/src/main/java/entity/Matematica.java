package entity;

public class Matematica {
    public double number1;
    public double number2;

    public Matematica(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Matematica() {
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    
    public double returnMajor(){
        if (this.number1 > this.number2){
            return this.number1;
        } else {
            return this.number2;
        }
    }
    
    public double myPow(){
        double majorNumber = this.returnMajor();
        long auxNumber1 = Math.round(this.number1);
        long auxNumber2 = Math.round(this.number2);
        if (this.number1 == majorNumber){
            return Math.pow(auxNumber1, auxNumber2);
        } else {
            return Math.pow(auxNumber2, auxNumber1);
        }
    }
    
    public double calculateSquareRoot(){
        if (this.number1 == this.returnMajor()){
            long auxNumber2 = Math.round(this.number2);
            if (auxNumber2 < 0){
                auxNumber2 = auxNumber2 * (-1);
            }
            return Math.pow(auxNumber2, 1/2);
        } else {
            long auxNumber1 = Math.round(this.number1);
            if (auxNumber1 < 0 ){
                auxNumber1 = auxNumber1 * (-1);
            }
            return Math.pow(auxNumber1, 1/2);
        }
    }
    
    
}
