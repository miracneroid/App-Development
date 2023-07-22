import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        System.out.println("Kilometer to Miles Converter");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Conversion factor for kilometers to miles
        double milesPerKilometer = 0.621371;

        // Convert kilometers to miles
        double miles = kilometers * milesPerKilometer;

        System.out.println("Distance in miles: " + miles);

        scanner.close();
    }
}
