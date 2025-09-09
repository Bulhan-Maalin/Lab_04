import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userPrice;
        double SALES_TAX = 0.05;

        System.out.println("Please input the price of your purchase.");
        userPrice = scan.nextDouble();
        double totalPrice = (userPrice * SALES_TAX) + userPrice;
        System.out.println("The total price of the purchase accounting for the 5% sales tax is $" + totalPrice + ".");


    }
}
