import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] freq = new int[26];

    
        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            freq[ch - 'a']++;
        }


        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(freq[ch - 'a'] == 1) {

                System.out.println("First Non-Repeating Character = " + ch);
                break;
            }
        }
    }
}
