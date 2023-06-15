package mathoperations;

public class AmstrongNumbers {
    public static void main(String[] args) {
        //  153; //1^3 + 5^3 + 3^3= 153 this is Amstrong
        // 152 // 1^3  + 5^3 + 2^3 =134 it is not Amstrong number
        getAmstrongNumbers(153);

    }

    public static int getAmstrongNumbers(int num) {

        int cont = 0;
        for (int i = num; i > 0; i /= 10) {
            int lastDigit = (i % 10);
            cont += lastDigit * lastDigit * lastDigit;
        }


        if(num ==cont){
            System.out.println("This is Amstrong Number");
        }else{
            System.out.println("This is Not Amstrong Number");
        }


        return cont;

    }

}


