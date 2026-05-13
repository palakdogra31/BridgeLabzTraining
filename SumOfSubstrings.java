import java.util.*;

public class Solution {

    public static int sumSubstrings(String s) {

        int sum = 0;

        for(int i = 0; i < s.length(); i++) {

            for(int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);

                sum = sum + Integer.parseInt(sub);
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");

        String s = sc.nextLine();

        int result = sumSubstrings(s);

        System.out.println("Sum of all substrings: " + result);
    }
}