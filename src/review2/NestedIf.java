package review2;

public class NestedIf {
    public static void main(String[] args) {
        boolean vaccine=false;
        int dose=3;

        if(vaccine){
            System.out.println("How many doses do you have?");

            if(dose==1){
                System.out.println(" You need a second dose");
            }else {
                System.out.println("You are full vaccinated");
            }
        } else {
            System.out.println("I don't have vaccine");
        }

    }
}
