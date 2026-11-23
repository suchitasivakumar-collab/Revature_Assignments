package com.vehicle;

public class Vehicle {
	String vehicleNumber;
    String model;
    double ratePerDay;
    int days;
    
    public Vehicle(String vehicleNumber, String model, double ratePerDay, int days) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.ratePerDay = ratePerDay;
        this.days = days;
    }

	public double calculateRent() {
        return ratePerDay * days;
	}
	
	public void displayDetails() {
		System.out.println("Vehicle | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + calculateRent());
    }

}