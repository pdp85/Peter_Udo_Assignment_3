package Chap149;

import java.util.Scanner;

public class ReverseTokens {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a line of text
        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();

        // Tokenize the input line using space characters as delimiters
        String[] tokens = inputLine.split(" ");

        // Output the tokens in reverse order
        System.out.println("Tokens in reverse order:");
        for (int i = tokens.length - 1; i >= 0; i--) {
            System.out.println(tokens[i]);
        }

        // Close the Scanner
        scanner.close();
    }
}
