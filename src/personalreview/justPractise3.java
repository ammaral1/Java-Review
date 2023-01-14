package personalreview;

import java.util.Scanner;

public class justPractise3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter three distinct numbers");
        int fNum=scan.nextInt();
        int sNum=scan.nextInt();
        int tNum=scan.nextInt();
        if (fNum>sNum && fNum>tNum){

            System.out.println("The largest number is "+fNum);
        }
        if (sNum>fNum && sNum>tNum){
            System.out.println("The largest number is "+sNum);
        }
        if (tNum>sNum && tNum>fNum){
            System.out.println("The largest number is "+tNum);
        }

    }
}
