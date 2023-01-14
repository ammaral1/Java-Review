package review2;

public class IfElse {
    public static void main(String[] args) {
        int num=12;

        if (num>100){
            System.out.println(num+" is greater than 100");
        } else {
            System.out.println(num+" is less than 100");
        }
        String button="Enrol today";

        if (button.equals("enrol today")){
            System.out.println("Test case pass");
        }else {
            System.out.println("Test case failed");
        }


    }
}
