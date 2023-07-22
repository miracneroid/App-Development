//Taking Input from user

import java.util.Scanner; //importing the user interacting library

public class ch3 {
    public static void main(String[] args) {
        System.out.println("Taking Input from user");

        Scanner sc = new Scanner(System.in); //storing the library in a variable 

        System.out.print("Enter first number: ");
        int a = sc.nextInt(); //commanding library for taking input

        //to check if user entered a integer of not -->
        //boolean b1 = sc.hasNextInt(a);
        //System.out.println(b1);

        System.out.print("Enter second number: ");
        int b = sc.nextInt(); //commanding library for taking input

        //to check if user entered a integer of not -->
        //boolean b2 = sc.hasNextInt(b);
        //System.out.println(b2);

        int sum = a + b;

        System.out.println("The sum of numbers: " + sum);

        sc.close();
    }
}