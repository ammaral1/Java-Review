package personalreview;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoopDemo2 {
    public static void main (String[] args){

        String sentence= "flapjacks are awesome!";
        Scanner scan=new Scanner(sentence);
        ArrayList<String> words=new ArrayList<String>();

        while (scan.hasNext()){
            words.add(scan.next());

        }
        System.out.println(words);

        System.out.println("*******");

        String sentence2="I am awesome too!";
        Scanner scan2=new Scanner(sentence2);
        ArrayList<String> words2=new ArrayList<String>();

        while (scan2.hasNext()){words2.add(scan2.next());

        }
        System.out.println(words2);

        System.out.println("*********");

        String  sentence3="This is my last trial for the day for the while loop video!";
        Scanner scan3=new Scanner (sentence3);
        ArrayList<String> words3=new ArrayList<String>();

        while (scan3.hasNext()){words3.add(scan3.next());

        }
        System.out.println(words3);

        System.out.println("*********");

        String sentence4="This is additional time for repeating purpose!";
        Scanner scan4=new Scanner (sentence4);
        ArrayList<String> words4=new ArrayList<String>();

        while (scan4.hasNext()){words4.add(scan4.next());

        }
        System.out.println(words4);
    }
}
