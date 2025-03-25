package com.other;

public class Vehicle {
    private final String plateNumber;
    private String brand;
    private int year;

    //final constant variable
    public static final int WHEELS = 4;

    //constructor
    public Vehicle(String plateNumber, String brand, int year) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.year = year;
    }

    //final method - cannot be overridden

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public final void print(){
        System.out.println("Plate Number: " + plateNumber + ", Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("ABC123", "Toyota", 2018);
        System.out.println("Plate Number: " + vehicle.getPlateNumber());
        System.out.println("Brand: " + vehicle.getBrand());
        System.out.println("Year: " + vehicle.getYear());
        System.out.println("Number of wheels: " + Vehicle.WHEELS);

        vehicle.setYear(2020);
        System.out.println("new Year: " + vehicle.getYear());
        vehicle.setBrand("Proton");
        System.out.println("new Brand: " + vehicle.getBrand());

        //cannot change the plate number
//        vehicle.plateNumber = "XYZ456";
    }
}
