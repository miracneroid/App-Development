import java.util.Scanner;

public class PercentageCalculator { //used PascalNamingConvention
    public static void main(String[] args) {
        System.out.println("This is a program to calculate percentage.");

        Scanner user =  new Scanner(System.in);

        System.out.print("Please enter the maximum max can be scored in a subject: ");
        int max = user.nextInt();

        System.out.println("Please enter the marks of subjects here--->");

        System.out.print("Subject 1: ");
        int m1 = user.nextInt();

        System.out.print("Subject 2: ");
        int m2 = user.nextInt();

        System.out.print("Subject 3: ");
        int m3 = user.nextInt();

        System.out.print("Subject 4: ");
        int m4 = user.nextInt();

        System.out.print("Subject 5: ");
        int m5 = user.nextInt();

        System.out.print("Subject 6: ");
        int m6 = user.nextInt();

        int sum = m1 + m2 + m3 + m4 + m5 + m6;

        float percentage = (float) sum / (6*max) * 100;

        float cgpa = percentage/10;

        System.out.println("Marks-Percentage based on the inputs = " + percentage + "%");

        System.out.println("CGPA based on the inputs = " + cgpa);

        user.close();
    }
}