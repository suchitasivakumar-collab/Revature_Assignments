package com.vehicle;

public class Bike extends Vehicle{
	
	public Bike(String vehicleNumber, String model,
            double ratePerDay, int days) {
		super(vehicleNumber, model, ratePerDay, days);
    }

	@Override
	public double calculateRent() {
		// TODO Auto-generated method stub
		double totalRent = ratePerDay * days;

        double discount = totalRent * 0.10;

        return totalRent - discount;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		    System.out.println("Bike | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + calculateRent());
		}	
}
