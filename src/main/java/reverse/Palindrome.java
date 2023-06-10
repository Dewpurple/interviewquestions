package reverse;

public class Palindrome {

    //whether phrase,sentence or squence are palindrome


    public static void main(String[] args) {
        isPalindrome("A man,a plan,a canal,Panama!");


    }

    public static String isPalindrome(String s) {
       s= s.toLowerCase().replaceAll(" ","").
                replaceAll("\\p{Punct}","");

        String c = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            c += s.charAt(i);
        }
        getPalindrome(c, s);
        return c;


    }

    public static void getPalindrome(String c, String s) {
if(c.equals(s)){
    System.out.println("Palindrome");
}else{
    System.out.println("Not Palindrome");
}

    }


}
