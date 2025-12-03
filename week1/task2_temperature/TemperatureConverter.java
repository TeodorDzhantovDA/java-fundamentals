package task2_temperature;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double tempInCelsius;

        System.out.println("Please enter temperature in Celsius");

        while(!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.next();
        }
            tempInCelsius = scanner.nextDouble();

            double tempInFahrenheit = tempInCelsius * 9.0 / 5.0 + 32;
            double tempInKelvin = tempInCelsius + 273.15;

            System.out.printf("Temperature in Celsius: %.2f\nTemperature in Fahrenheit: %.2f\nTemperature in Kelvin: %.2f",
                    tempInCelsius,tempInFahrenheit,tempInKelvin);
    }
}
