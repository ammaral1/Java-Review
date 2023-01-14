package personalreview;

import java.util.Scanner;

public class ScannerReview {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("What is your name?");
       String name=scan.next();

       System.out.println("What is your age?");
       int age=scan.nextInt();

       System.out.println("What is your quote?");
       String quote=scan.next();
       quote += scan.nextLine();

       System.out.println("Your name is "+name+" and your age is "+age+" and your quote is "+quote);


    }
}
