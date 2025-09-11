import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userTemperature;
        double userTemperatureCelsius;

        System.out.println("Please enter the temperature of your area in fahrenheit:");
        userTemperature = scan.nextDouble();
        userTemperatureCelsius = (double) 5/9 * (userTemperature - 32);
        System.out.println("The temperature you inputted converted from fahrenheit to celsius is " + userTemperatureCelsius + ".");

    }
}
