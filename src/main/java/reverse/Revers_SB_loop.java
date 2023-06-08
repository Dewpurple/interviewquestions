package reverse;

import java.util.Scanner;

public class Revers_SB_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence or world for reverse");
        String reverse = input.nextLine();

        getReverseStringB(reverse);
        getReverseLoop(reverse);
        System.out.println(getRvrsLoop(reverse));

        input.close();


    }

    public static void getReverseStringB(String rev) {

        System.out.println("*****1.way by using String Builder*********");
        StringBuilder sb = new StringBuilder(rev);
        System.out.println(sb.reverse());


    }

    public static void getReverseLoop(String reverse) {

        System.out.println("*****2.way by using for loop*********");
        String reverseCont = "";
        for (int i = reverse.length() - 1; i >= 0; i--) {
            reverseCont += reverse.charAt(i);
        }

        System.out.println(reverseCont);
    }

    public static String getRvrsLoop(String reverse) {

        System.out.println("*****3.way by using for loop and return method*********");
        String reverseCont = "";
        for (int i = reverse.length() - 1; i >= 0; i--) {
            reverseCont += reverse.charAt(i);
        }

        return reverseCont;


    }



}