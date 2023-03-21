package entity;

import java.util.Scanner;

public class MovilStore {
    String brand;
    double prize;
    String model;
    int memoryRam;
    int store;
    int[] code = new int[7];
    Scanner scanner = new Scanner(System.in);

    public MovilStore(String brand, double prize, String model, int memoryRam, int store) {
        this.brand = brand;
        this.prize = prize;
        this.model = model;
        this.memoryRam = memoryRam;
        this.store = store;
    }

    public MovilStore() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }

    public int[] getCode() {
        return code;
    }

    public void setCode(int[] code) {
        this.code = code;
    }
    
    public MovilStore loadMovil(){
        System.out.println("Add brand name:");
        MovilStore newMovilStore = new MovilStore();
        newMovilStore.setBrand(scanner.nextLine());
        newMovilStore.loadCode();
        System.out.println("add memory ram: ");
        newMovilStore.setMemoryRam(scanner.nextInt());
        System.out.println("Model: ");
        newMovilStore.setModel(scanner.nextLine());
        System.out.println("Prize: ");
        newMovilStore.setPrize(scanner.nextDouble());
        System.out.println("Store: ");
        newMovilStore.setStore(scanner.nextInt());
        
        return newMovilStore;
    }
    
    public void loadCode(){
        for (int i=0; i<7; i++){
            System.out.println("Add code number: ");
            this.code[i] = scanner.nextInt();
        }
    }
}
