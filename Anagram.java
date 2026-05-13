// import java.util.*;
// public class Anagram{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String str1="";
//         String str2="";
//         str1=sc.nextLine();
//         str2=sc.nextLine();
//         int freq[]=new int[256];
//         if(str1.length() != str2.length()){
//             System.out.println("not anagram");
//             return;
//         }
//         for(int i=0;i<str1.length();i++){
//             freq[str1.charAt(i)]++;
//             freq[str2.charAt(i)]--;
//         }
//         boolean isAnagram=true;
//         for(int i=0;i<236;i++){
//             if(freq[i]!=0){
//                 isAnagram=false;
//                 break;
//             }
//         }
//         if(isAnagram){
//             System.out.println("anagram");

//         }
//         else{
//             System.out.println("not anagram");
//         }

//     }
// }




import java.util.*;
public class Anagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1="";
        String str2="";
        str1=sc.nextLine();
        str2=sc.nextLine();
        char[] arr1=str1.toCharArray();
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