package com.vehicle;

public class Car extends Vehicle{
	double insurancePerDay;
	
	public Car(String vehicleNumber, String model, double ratePerDay,
	        int days, double insurancePerDay) {
		super(vehicleNumber, model, ratePerDay, days);
        this.insurancePerDay = insurancePerDay;
	}

	@Override
	public double calculateRent() {
		// TODO Auto-generated method stub
		return (ratePerDay + insurancePerDay) * days;
		
	}

	@Override
	public void displayDetails() {
	    System.out.println("Car  | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + calculateRent());
	}

}
