import java.util.*;

public class LargestWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words=str.split(" ");
        String largest=words[0];
        for(int i=0;i<words.length;i++){
            if(words[i].length()>largest.length()){
                largest=words[i];
            }
        }
        System.out.println(largest);
    }
}