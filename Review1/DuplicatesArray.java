import java.util.*;

public class DuplicatesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] brr=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                     brr[k]=arr[i];
                     k++;
                     break;
                }
            }
        }
        
        for(int i = 0; i < k; i++) {
            System.out.print(brr[i]+" ");
        }
    }
}