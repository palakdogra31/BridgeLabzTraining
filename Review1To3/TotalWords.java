// import java.util.*;

// public class CountWords {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();

//         str = str.trim();

//         String[] words = str.split(" ");

//         System.out.println("Total Words = " + words.length);
//     }
// }



import java.util.*;

public class CountWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count=0;
        boolean inWord=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                if(inWord==false){
                    count++;
                    inWord=true;
                }
            }
            else{
                inWord=false;
            }
        }
        System.out.println(count);
    }
}
