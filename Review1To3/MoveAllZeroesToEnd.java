import java.util.*;
public class MoveAllZeroesTOEnd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int[] brr=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                brr[j]=arr[i];
                j++;

            }
            
        }
        for(int i=0;i<n;i++){
                System.out.print(brr[i]+" ");
            }

        
    }
}