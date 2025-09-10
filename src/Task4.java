public class Task4 {
    public static void main(String[] args) {
        double startingPayment = 5000;
        double SALES_TAX = .17;
        double monthOneMoney = (startingPayment * SALES_TAX) + startingPayment;
        double monthTwoMoney = (monthOneMoney * SALES_TAX) + monthOneMoney;


        System.out.println("The money in your account after one month is $" + monthOneMoney + ", and the money in your account after two months is $" + monthTwoMoney + "");


    }
}
