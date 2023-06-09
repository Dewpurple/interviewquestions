package mathoperations;

public class PrimeNumber {
    public static void main(String[] args) {
        getPrimeNumbers(26);
    }

    public static void getPrimeNumbers(int num){
        if(num<0){
            System.out.println("The number must be positive");
        }

        int flag=0;
        for (int i = 1; i <=num ; i++) {
            if (num % i == 0) {
                flag++;
            }
        }

            if(flag==2){
                System.out.println("This is prime");
            }else{
                System.out.println("This is not prime");
            }




    }
}
