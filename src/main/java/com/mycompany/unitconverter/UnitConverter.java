/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unitconverter;

/**
 *
 * @author Brigette Setlago
 */

 import java.util.Scanner;
 
public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept user inputs
        System.out.println("Unit Converter Program");
        System.out.print("Enter the unit you want to convert from (Feet, Pounds, Fahrenheit): ");
        String fromUnit = scanner.nextLine().toLowerCase();

        System.out.print("Enter the unit you want to convert to (Meters, Kgs, Celsius): ");
        String toUnit = scanner.nextLine().toLowerCase();

        System.out.print("Enter the quantity to be converted: ");
        double quantity = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        // Perform conversion based on user inputs
        double result = convert(fromUnit, toUnit, quantity);

        // Display the result
        System.out.println("Result: " + quantity + " " + fromUnit + " = " + result + " " + toUnit);

        scanner.close();
    }

    // Conversion method
    private static double convert(String fromUnit, String toUnit, double quantity) {
        switch (fromUnit) {
            case "feet":
                return feetToMeters(quantity, toUnit);
            case "pounds":
                return poundsToKgs(quantity, toUnit);
            case "fahrenheit":
                return fahrenheitToCelsius(quantity, toUnit);
            default:
                System.out.println("Invalid units entered. Please choose from Feet, Pounds, Fahrenheit.");
                return 0.0;
        }
    }

    // Specific conversion methods
    private static double feetToMeters(double feet, String toUnit) {
        return toUnit.equals("meters") ? feet * 0.3048 : 0.0;
    }

    private static double poundsToKgs(double pounds, String toUnit) {
        return toUnit.equals("kgs") ? pounds * 0.453592 : 0.0;
    }

    private static double fahrenheitToCelsius(double fahrenheit, String toUnit) {
        return toUnit.equals("celsius") ? (fahrenheit - 32) * 5/9 : 0.0;
    }
}
