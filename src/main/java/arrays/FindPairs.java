package arrays;

public class FindPairs {

    public static void main(String[] args) {
        findPairs (new int[] {4,6,8,7,20,-10},10);
    }

    public static void findPairs(int []arr,int n){
        for (int i = 0; i <arr.length-1 ; i++) {

            if(arr[i]+arr[i+1]==n){
                System.out.println(arr[i]+ "+" + arr[i+1] +"=" +n);
            }
        }
    }
}
