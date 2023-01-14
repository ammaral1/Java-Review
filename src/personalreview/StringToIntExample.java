package personalreview;

public class StringToIntExample {
    public static void main(String[] args) {
        String s="102";
        System.out.println(s+4);
        System.out.println(Integer.parseInt(s)+4);
        int n=8;

        System.out.println(Integer.toString(n)+1);

        System.out.println("********");
        String z="my age is 44 years ";

        z=z.replaceAll("\\D+", "");
        System.out.println(Integer.parseInt(z)+2);




    }
}
