package mathoperations;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 10;

        System.out.println("******* 1.way ********");

//        int num3=num1;
//        num1=num2;
//        num2=num3;
//
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);

        System.out.println("******* 2.way ********");

        num1 = num1 + num2;//num1=19
        num2 = num1 - num2;//num2=9
        num1 = num1 - num2;//num1=10

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }
}
