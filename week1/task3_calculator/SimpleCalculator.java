package task3_calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numA = Double.parseDouble(scanner.nextLine());
        String operationInput = scanner.nextLine();
        double numB = Double.parseDouble(scanner.nextLine());

        while (!operationInput.equals("End")) {

            double result = 0;

            switch (operationInput) {
                case "+":
                    result = numA + numB;
                    break;

                case "-":
                    result = numA - numB;
                    break;

                case "*":
                    result = numA * numB;
                    break;

                case "/":
                    if (numB == 0) {
                        System.out.println("Division by zero is not allowed");
                        return;
                    }
                    result = numA / numB;
                    break;

                default:
                    // Handles ANY unknown operation
                    System.out.println("Unknown operation");
                    return;
            }

            System.out.println(result);

            // Read next operation
            operationInput = scanner.nextLine();

            if (operationInput.equals("End")) {
                return;
            }

            // Read next number ONLY if operation is valid
            numB = Double.parseDouble(scanner.nextLine());
            numA = result;
        }
    }
}