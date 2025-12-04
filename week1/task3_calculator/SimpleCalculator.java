package task3_calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numA = Double.parseDouble(scanner.nextLine());
        String operationInput = scanner.nextLine();
        double numB = Double.parseDouble(scanner.nextLine());

        while (!operationInput.equals("End")) {

            boolean isValidOperation =
                    operationInput.equals("+") ||
                            operationInput.equals("-") ||
                            operationInput.equals("*") ||
                            operationInput.equals("/");

            if (!isValidOperation) {
                System.out.println("Unknown operation");
                return;
            }

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
                    if (numA == 0 || numB == 0) {
                        System.out.println("Division by zero is not allowed");
                        return;
                    }
                    result = numA / numB;
                    break;
            }
            System.out.println(result);
            operationInput = scanner.nextLine();

            if (operationInput.equals("End")) {
                return;
            }

            isValidOperation =
                    operationInput.equals("+") ||
                            operationInput.equals("-") ||
                            operationInput.equals("*") ||
                            operationInput.equals("/");

            if (!isValidOperation) {
                System.out.println("Unknown operation");
                return;
            }

            numB = Double.parseDouble(scanner.nextLine());
            numA = result;
        }
    }
}