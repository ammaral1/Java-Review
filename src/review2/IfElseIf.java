package review2;

public class IfElseIf {
    public static void main(String[] args) {
       int num=30;

        if (num>25){
            System.out.println("great job");
        }else if (num>20 || num<=25){
            System.out.println("good job");
        }else if (num>10 || num<=20){
            System.out.println("ok job");
        }else if (num>=0 || num<=5){
            System.out.println("not good job");
        }
        System.out.println("------------------");

        String browser="opera";

        if (browser.equals("chrome")){
            System.out.println("Test cases executed on chrome browser");
        }else if (browser.equals("safari")){
            System.out.println("Test cases executed on safari browser");
        }else if (browser.equals("firefox")){
            System.out.println("Test cases executed on firefox browser");
        }else{
            System.out.println("the browser is not supported");
        }
    }
}
