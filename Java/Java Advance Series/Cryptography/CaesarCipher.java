import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 for encryption, 2 for decryption: ");
        int choice = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the key (a positive integer): ");
        int key = scanner.nextInt();

        if (choice == 1) {
            String encryptedText = encrypt(text, key);
            System.out.println("Encrypted text: " + encryptedText);
        } else if (choice == 2) {
            String decryptedText = decrypt(text, key);
            System.out.println("Decrypted text: " + decryptedText);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }

    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char shift = Character.isLowerCase(ch) ? 'a' : 'A';
                char encryptedChar = (char) ((ch - shift + key) % 26 + shift);
                result.append(encryptedChar);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, int key) {
        return encrypt(text, 26 - key); // Decryption is the same as encryption with the inverse key
    }
}
