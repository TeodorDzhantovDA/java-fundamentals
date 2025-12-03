package task1_user_info;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your monthly salary: ");
        double monthlySalary = Double.parseDouble(scanner.nextLine());
        double yearlySalary = monthlySalary * 12;

        System.out.print("Do you have a driving license? (true/false): ");
        String licenseInput = scanner.nextLine().toLowerCase();
        boolean hasDrivingLicense;
        String hasDrivingLicenseAnswer = "";

        if (licenseInput.equals("true")) {
            hasDrivingLicense = true;
            hasDrivingLicenseAnswer = "yes";
        } else if(licenseInput.equals("false")) {
            hasDrivingLicense = false;
            hasDrivingLicenseAnswer = "no";
        } else {
            System.out.println("Invalid input for driving license. Please enter true or false.");
            licenseInput = scanner.nextLine().toLowerCase();
        }
        System.out.println("Hello, " + name + "! You are " + age + " years old. Yearly salary: " + yearlySalary + ". Driver's license: " + hasDrivingLicenseAnswer);
    }
}
