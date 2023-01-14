package personalreview;

public class WhileLoopExample {
    public static void main(String[] args) {
        int a=5;

        for (int i=5; i<10;i++){
            System.out.println("i is less than 10; "+i);
        }
        System.out.println("*********");

        while (a<=10){
            System.out.println("a is less than 10: "+a);
            a++;
        }
    }
}
