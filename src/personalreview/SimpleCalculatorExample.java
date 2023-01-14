package personalreview;

import java.util.Scanner;

public class SimpleCalculatorExample {
    public static void main (String[] args){
        Scanner scan=new Scanner (System.in);
        double firstNumber, secondNumber, answer;
        System.out.println("Enter first number");
        firstNumber=scan.nextDouble();
        System.out.println("Enter second number");
        secondNumber=scan.nextDouble();
        answer=firstNumber+secondNumber;
        System.out.println("The answer of the addition operation is "+answer);

    }
}
