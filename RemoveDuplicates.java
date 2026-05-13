import java.util.*;
public class RemoveDuplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str="";
        str=sc.nextLine();
        int[] visited=new int[256];
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(visited[ch]==0){
                result+=ch;
                visited[ch]=1;
            }
        }
        System.out.println(result);
    }
}