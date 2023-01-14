package review2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanMachine=new Scanner(System.in);
        System.out.println("What is your full name?");

        String fullName=scanMachine.nextLine();

        System.out.println("What is your age?");
        int age=scanMachine.nextInt();
        System.out.println("Are you rich?");
        boolean rich=scanMachine.nextBoolean();
        System.out.println("what is your nickname?");
        String nickName=scanMachine.next();

        System.out.println("Your name is "+fullName+" and your age is "+age+" and you are rich "+rich+" and your nickname is "+nickName);



    }
}
