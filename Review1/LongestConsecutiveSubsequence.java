import java.util.*;
public class LongestConsecutiveSubsequence {
    public static int longestSubsequence(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        int longest = 0;
        for (int num : arr) {
            if (!list.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                while (list.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        // int[] arr = {100, 4, 200, 1, 3, 2};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(longestSubsequence(arr));
    }
}
