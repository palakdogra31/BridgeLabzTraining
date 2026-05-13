// import java.util.*;
// public class ReverseString {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//         String rev="";
//         for(int i=str.length()-1;i>=0;i--){
//             rev+=str.charAt(i);
//         }
//         System.out.println(rev);
//     }
    
// }




//reverse String by two pointer
import java.util.*;
public class ReverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        
        int i=0;
        int j=sb.length()-1;
        while(i<=j){
            char temp1=sb.charAt(i);
            char temp2=sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;

        }
        System.out.println(sb);
    }
}