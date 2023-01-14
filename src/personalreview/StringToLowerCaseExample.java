package personalreview;

import java.util.Scanner;

public class StringToLowerCaseExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your month");
        String month;
        month = scan.next();
        month=month.toLowerCase();
        if (month.equals("june") || month.equals("july") || month.equals("august")) {
            System.out.println("You were born in Summer");
        } else if (month.equals("september") || month.equals("october") || month.equals("november")) {
            System.out.println("You were born in Fall");
        } else if (month.equals("december") || month.equals("january") || month.equals("february")) {
            System.out.println("You were born in Winter");
        } else if (month.equals("march") || month.equals("april") || month.equals("may")) {
            System.out.println("You were born in Spring");
        }
    }
}
