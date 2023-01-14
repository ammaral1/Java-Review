package personalreview;

public class TypeCastingExample {

    static final int MAX_AGE=100;

    public static void main(String[] args) {
        byte a=1;

        double g=55.1;
        int ex=(int)g;
        System.out.println(ex);

        String b="hello";
        double result=b.equals("hello") ? 0.5 : 0.25;
        System.out.println(result);




    }
}
