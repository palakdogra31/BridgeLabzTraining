import java.util.*;
public class Anagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1="";
        String str2="";
        str1=sc.nextLine();
        str2=sc.nextLine();
        char[] arr1=str1.toCharArray();      //nlogn    space -n
        char[] arr2=str2.toCharArray();
        if(str1.length() != str2.length()) {
         System.out.println("not anagram");
            return;
}
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }

        
    }
}