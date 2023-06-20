package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateListElements {
    public static void main(String[] args) {
        getScanner();


    }

    public static void getScanner(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements as String, and when you want to Stop press *");
        input.close();
        getString(input);
    }


  public static void getString(Scanner input){

   List<String > list=new ArrayList<>();
   String str="";

   do{
        str= input.next();
        if(!str.equals("*") &&  (! list.contains(str)))
        list.add(str);

   }while(!str.equals("*"));

        System.out.println("list = " + list);


    }
}
