import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // initializing all of the variables & the scanner
        Scanner scan = new Scanner(System.in);
        double springCost;
        double summerCost;
        double fallCost;
        double winterCost;
        //receiving all of the costs from the user.
        System.out.println("Please output the total cost of maintenance for spring:");
        springCost = scan.nextDouble();
        System.out.println("Please output the total cost of maintenance for summer:");
        summerCost = scan.nextDouble();
        System.out.println("Please output the total cost of maintenance for fall:");
        fallCost = scan.nextDouble();
        System.out.println("Please output the total cost of maintenance for winter:");
        winterCost = scan.nextDouble();
        //defining the total
        double totalCost = springCost + summerCost + fallCost + winterCost;
        //outputting the total
        System.out.println("The total maintenance cost for all of the 4 seasons combined is $" + totalCost + "");
    }
}
