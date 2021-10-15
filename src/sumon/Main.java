package sumon;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MyCalculator calculator = new MyCalculator();

        System.out.print("Please Enter the number you want sum of divisor: ");
        int x = input.nextInt();
        System.out.println("Sum of the Divisors = " +calculator.divisorSum(x));

        System.out.print("Please Enter the number you want factorial: ");
        int y = input.nextInt();
        System.out.println("Factorial of the number = " +calculator.findFactorial(y));

    }
}
/**
 * Name: Md. Atikul Islam Sumon
 * ID: 2012020122
 * Section: C
 * Email: cse_2012020122@lus.ac.bd
 * Date: 15/10/2021
 */




