public class Task1 {
    public static void main(String[] args) {
        // Defining Variables
        int intOperandA = 27;
        int intOperandB = 3;
        int intSum = intOperandA + intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;
        double doubleOperandA = 12.5;
        double doubleOperandB = 2.5;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo = doubleOperandA % doubleOperandB;
        // Done Defining Variables
        // Printing all of the variables that we determined earlier, first the ints!
        System.out.println("The sum using the ints " + intOperandA + " and " + intOperandB + " is " + intSum + ".");
        System.out.println("The difference using the ints " + intOperandA + " and " + intOperandB + " is " + intDifference + ".");
        System.out.println("The product using the ints " + intOperandA + " and " + intOperandB + " is " + intProduct + ".");
        System.out.println("The quotient using the int " + intOperandA + " and " + intOperandB + " is " + intQuotient + ".");
        System.out.println("The module using the int " + intOperandA + " and " + intOperandB + " is " + intModulo + ".");
        // Next the doubles!
        System.out.println("The sum using the doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum + ".");
        System.out.println("The difference using the doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference + ".");
        System.out.println("The product using the doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct + ".");
        System.out.println("The quotient using the doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient + ".");
        System.out.println("The module using the doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo + ".");
    }
}
