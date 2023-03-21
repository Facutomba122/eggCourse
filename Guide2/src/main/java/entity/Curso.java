package entity;

import java.util.Scanner;

public class Curso {
    String curseName;
    double amountHours;
    double amountDays;
    char turn;
    double pricePerHour;
    String[] students = new String[5];
    private Scanner scanner = new Scanner(System.in); 
    
    public Curso() {
    }

    public Curso(String curseName, double amountHours, double amountDays, char turn, double pricePerHour) {
        this.curseName = curseName;
        this.amountHours = amountHours;
        this.amountDays = amountDays;
        this.turn = turn;
        this.pricePerHour = pricePerHour;
    }

    public String getCurseName() {
        return curseName;
    }

    public void setCurseName(String curseName) {
        this.curseName = curseName;
    }

    public double getAmountHours() {
        return amountHours;
    }

    public void setAmountHours(double amountHours) {
        this.amountHours = amountHours;
    }

    public double getAmountDays() {
        return amountDays;
    }

    public void setAmountDays(double amountDays) {
        this.amountDays = amountDays;
    }

    public char getTurn() {
        return turn;
    }

    public void setTurn(char turn) {
        this.turn = turn;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }
    
    public void loadStudents(){
        for (int i=0; i<5; i++){
            System.out.println("Ingrese nombre estudiante:");
            this.students[i] = scanner.nextLine();
        }
    }
    
    public Curso createCurse(){
        Curso newCurso = new Curso();
        System.out.println("Ingrese cantidad dias: ");
        newCurso.setAmountDays(scanner.nextInt());
        System.out.println("Ingrese cant horas: ");
        newCurso.setAmountHours(scanner.nextInt());
        System.out.println("Ingrese nobre: ");
        newCurso.setCurseName(scanner.nextLine());
        System.out.println("Ingrese precio/hora: ");
        newCurso.setPricePerHour(scanner.nextDouble());
        newCurso.loadStudents();
        System.out.println("Ingrese turno: ");
        char turn = scanner.nextLine().charAt(0);
        while (turn != 'M' && turn!= 'T'){
            System.out.println("ERROR");
            turn = scanner.nextLine().charAt(0);
        }
        newCurso.setTurn(turn);
        return newCurso;
    }
    
    public double calculateProfit(){
        return this.amountDays * this.amountHours * this.pricePerHour * 5;
    }
}
