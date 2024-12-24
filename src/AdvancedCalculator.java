import java.util.InputMismatchException;
import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Advanced Calculator");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();

            if (choice == 5) {
                continueRunning = false;
                System.out.println("Exiting...");
                continue;
            }

            double num1 = 0, num2 = 0;
            try {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values.");
                scanner.next(); // Clear the invalid input
                continue;
            }

            double result = 0;
            boolean validOperation = true;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("The result is: " + result);
            }
        }

        scanner.close();
    }
}