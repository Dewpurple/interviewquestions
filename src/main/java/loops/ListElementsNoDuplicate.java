package loops;

import java.util.*;

public class ListElementsNoDuplicate {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter elements as String, and when you want to Stop press 0");
        input.close();

        List<String> l1=new ArrayList<>();
        do{
            String elements=input.next();


           if(!elements.equals("0")){
               l1.add(elements);
           }else{
               break;
           }
       }while (true);

        Set<String> uniqueList=new HashSet<>(l1);
        System.out.println("uniqueList = " + uniqueList);
    }
}
