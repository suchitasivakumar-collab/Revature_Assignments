package com.vehicle;

import java.util.Scanner;

public class RentalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        Vehicle[] vehicles = new Vehicle[n];


        for (int i = 0; i < n; i++) {

            int type;

            while (true) {

                System.out.print("Enter type (1-Car, 2-Bike): ");
                type = sc.nextInt();

                if (type == 1 || type == 2) {
                    break;
                }

                System.out.println("Invalid vehicle type! Please enter 1 or 2.");
            }

            sc.nextLine();

            System.out.print("Enter Vehicle Number: ");
            String number = sc.nextLine();

            System.out.print("Enter Model: ");
            String model = sc.nextLine();

            System.out.print("Enter Rate per Day: ");
            double rate = sc.nextDouble();

            System.out.print("Enter Days: ");
            int days = sc.nextInt();

            if (type == 1) {

                System.out.print("Enter Insurance per Day: ");
                double insurance = sc.nextDouble();

                vehicles[i] = new Car(number, model, rate, days, insurance);
            }

            else if (type == 2) {

                vehicles[i] = new Bike(number, model, rate, days);
            }
        }

        System.out.println("\n--- Rental Details ---");

        double totalRent = 0;

        for (int i = 0; i < n; i++) {

            Vehicle v = vehicles[i];

            v.displayDetails();

            totalRent = totalRent + v.calculateRent();
        }

        System.out.println("Total Rent Collected: " + totalRent);

        sc.close();
    }
}

