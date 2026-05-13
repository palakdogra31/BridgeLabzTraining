// import java.util.*;
// public class NumberOfWords{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String str="";
//         str=sc.nextLine();
//         int count=0;
//         boolean inWord=false;
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)!=' '){
//                 if(!inWord){
//                 count++;
//                 inWord=true;
//             }
//             }
//             else{
//                 inWord=false;
//             }
//         }
//         System.out.println(count);
//     }
// }





import java.util.*;

public class NumberOfWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        System.out.println(words.length);
    }
}