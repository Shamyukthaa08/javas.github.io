
    import java.util.Scanner;

public class SecondHighestLowest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables for the five numbers and the second highest and lowest
        int num1, num2, num3, num4, num5;
        int secondHighest, secondLowest;

        // Input for five numbers
        System.out.println("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        num3 = scanner.nextInt();

        System.out.println("Enter the fourth number: ");
        num4 = scanner.nextInt();

        System.out.println("Enter the fifth number: ");
        num5 = scanner.nextInt();

        // Find the second highest and second lowest
        if (num1 > num2) {
            secondHighest = num1;
            secondLowest = num2;
        } else {
            secondHighest = num2;
            secondLowest = num1;
        }

        // Compare with the remaining numbers
        if (num3 > secondHighest) {
            secondHighest = num3;
        } else if (num3 > secondLowest) {
            secondLowest = num3;
        }

        if (num4 > secondHighest) {
            secondHighest = num4;
        } else if (num4 > secondLowest) {
            secondLowest = num4;
        }

        if (num5 > secondHighest) {
            secondHighest = num5;
        } else if (num5 > secondLowest) {
            secondLowest = num5;
        }

        // Print the results
        System.out.println("Second Highest: " + secondHighest);
        System.out.println("Second Lowest: " + secondLowest);

        // Close the scanner
        scanner.close();
    }
}

    

