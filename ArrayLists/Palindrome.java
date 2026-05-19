// import java.util.*;
// public class Palindrome{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         ArrayList<Integer> list=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             list.add(sc.nextInt());
//         }
       
//         ArrayList<Integer> reverse=new ArrayList<>();
//         for(int i=list.size()-1;i>=0;i--){
//             reverse.add(list.get(i));
//         }
//          boolean isPalindrome=true;
//          for(int i=0;i<list.size();i++){
//             if(!list.get(i).equals(reverse.get(i))){
//                 isPalindrome=false;
//                 break;
//             }
//          }

//          if(isPalindrome){
//             System.out.print("Palindrome");
//          }
//          else{
//             System.out.print("not palindrome");
//          }
        
//     }
// }


import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);

        boolean isPalindrome = true;

        int start = 0;
        int end = list.size() - 1;

        while(start < end) {

            if(!list.get(start).equals(list.get(end))) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println(isPalindrome);
    }
}