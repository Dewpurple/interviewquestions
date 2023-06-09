package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DifferenceBetweenHighestLowest {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int length=input.nextInt();

        int []arr=new int[length];

        for (int i = 0; i <length ; i++) {
            System.out.println("pls write numbers that as much as what did you write as length");
            arr[i]=input.nextInt();

        }

        Arrays.sort(arr);
        System.out.println(arr[(arr.length - 1)]-arr[0]);
        int difBetweenFirstIndexandLast=arr[(arr.length - 1)]-arr[0];
        System.out.println(difBetweenFirstIndexandLast);


        input.close();
    }



}
