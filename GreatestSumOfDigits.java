package sdmLab;

import java.util.Scanner;

public class GreatestSumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the greatest number
        int greatestNumber;

        if (num1 >= num2) {
            if (num1 >= num3) {
                greatestNumber = num1;
            } else {
                greatestNumber = num3;
            }
        } else {
            if (num2 >= num3) {
                greatestNumber = num2;
            } else {
                greatestNumber = num3;
            }
        }

        // Calculate the sum of digits
        int sumOfDigits = 0;
        int num = greatestNumber;

        while (num != 0) {
            int digit = num % 10;
            sumOfDigits += digit;
            num /= 10;
        }

        System.out.println("The greatest number is: " + greatestNumber);
        System.out.println("The sum of its digits is: " + sumOfDigits);

        scanner.close();
    }
}
