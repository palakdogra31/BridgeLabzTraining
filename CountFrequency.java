// import java.util.*;
// public class CountFrequency{
// public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     String str="";
//     str=sc.nextLine();
//     char target=sc.next().charAt(0);
//     int count=0;
//     for(int i=0;i<str.length();i++){
//         if(str.charAt(i)==target){
//             count++;
//         }
//     }
//     System.out.println(count);
// }
// }




import java.util.*;
public class CountFrequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] freq=new int[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                System.out.println((char)i+":"+freq[i]);
            }
        }
    }
}