package com.syntax.review1;

public class LogicalOperators {
    public static void main(String[] args) {

        int a=3;
        int b=4;


        boolean sunny=false;
        boolean imHappy=true;
        if ((a<b && sunny) || b<a || imHappy || (a>b || b<a) )  {
            System.out.println("Its gonna be a good day");
        }

    }
}
