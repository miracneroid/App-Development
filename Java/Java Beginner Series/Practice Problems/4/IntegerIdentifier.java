import java.util.Scanner;

public class IntegerIdentifier {
    public static void main(String[] args) {
        
        System.out.println("Integer Identifier --->");

        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);

        System.out.println("The entered number is a integer? --> " + sc.hasNextInt());

        sc.close();

    }
}