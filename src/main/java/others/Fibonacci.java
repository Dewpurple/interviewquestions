package others;

public class Fibonacci {

    public static void main(String[] args) {
        getFibonacci(8);

    }

    public static void getFibonacci(int f){
        int f1=0;
        int f2=1;
        System.out.print(f1+ " ");
        System.out.print( f2+ " ");

        int count=0;//1 2 3
        for (int i = 2; i <f-1 ; i++) {//2, 3, 4, 5, 6, 7
            count=f1+f2;//1
                  //1+1=>count=2
                 //1+2=>count=3

            f1=f2;//f1=1,f1=1,f1=2
            f2=count;//f2=1,f2=2,f2=3

            System.out.print(count + " ");



        }

    }
}
