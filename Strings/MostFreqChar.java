import java.util.*;
public class MostFreqChar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        char ans=s.charAt(0);
        char[] arr=s.toCharArray();
        
        Arrays.sort(arr);
        int maxFreq=-1;
        
        int i=0;
        int j=0;
        while(j<n){
            if(arr[i]==arr[j]) j++;
            else{
                int freq=j-i;
                if(freq>maxFreq){
                    maxFreq=freq;
                    ans=arr[i];
                }
                i=j;
            }
        }
         int freq=j-i;
                if(freq>maxFreq){
                    maxFreq=freq;
                    ans=arr[i];
                }
                System.out.println(ans);
        
    }
}


//optimized approach freq array
// class Solution {
//     public char getMaxOccuringChar(String s) {
//         // code here
//         int[] freq=new int[26];
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             int idx=ch-'a'; // ch-97
//             freq[idx]++;
//         }
//         int maxFreq=-1;
//         char ans=s.charAt(0);
//         for(int i=0;i<26;i++){
//             if(freq[i]>maxFreq){
//                 maxFreq=freq[i];
//                 ans= (char)(i+97);
//             }
//         }
//         return ans;
        
//     }
// }