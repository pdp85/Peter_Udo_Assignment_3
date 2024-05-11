import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Compare the strings using the compareTo method
        int result = firstString.compareTo(secondString);

        // Output the result
        if (result < 0) {
            System.out.println("The first string is less than the second string.");
        } else if (result > 0) {
            System.out.println("The first string is greater than the second string.");
        } else {
            System.out.println("The first string is equal to the second string.");
        }

        scanner.close();
    }
}
