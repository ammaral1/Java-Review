package personalreview;

import java.util.ArrayList;
import java.util.Scanner;

public class JustPractise5 {
    public static void main(String[] args) {

     int [][]array={{1, 2, 3, 100},
                    {4, 5, 6, 200},
                    {7, 8, 9, 300}};
        System.out.println(array[1][3]);

        int [][]array2=new int [3][3];
        array2[0][0]=1;
        array2[0][1]=2;
        array2[0][2]=3;
        array2[1][0]=4;
        array2[1][1]=5;
        array2[1][2]=6;
        array2[2][0]=7;
        array2[2][1]=8;
        array2[2][2]=9;
       System.out.println(array2[1][2]);
        System.out.println("--------------------------");
       for (int i=0;i<3;i++){
          System.out.println(array[i][i]);


           }
        System.out.println("------------");
        for (int i=0; i<3; i++){
            for (int j=0;j<4; j++){
                System.out.println(array[i][j]);
            }
       }


        }}

