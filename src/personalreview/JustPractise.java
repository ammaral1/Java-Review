package personalreview;



import java.util.Scanner;

public class JustPractise {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Please enter number");
        int number=scan.nextInt();
        if (number%2==0){
            System.out.println("Value is even");
            if (number>1000){
                System.out.println("even number is large");
            }else {
                System.out.println("even number is just right");
            }

        }else{
            System.out.println("Value is odd");
            if (number >1000){
                System.out.println("odd number is large");
            }else {
                System.out.println("odd number is just right");
            }
        }



        }
        }

