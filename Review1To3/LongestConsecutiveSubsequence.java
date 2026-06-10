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




//optimized way by using hashset

import java.util.HashSet;

public class LongestConsecutive {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1: add all numbers into set
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: check every number
        for (int num : set) {

            // Step 3: check if it is starting point
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // keep checking next consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};

        System.out.println(longestConsecutive(nums));
    }
}
