import java.util.*;
public class DuplicateCharString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++){
                 char ch=str.charAt(i);
                 freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>1){
                    char ch=(char)(i+'a');
                    System.out.print(ch+" ");

            }
        }
    }
}