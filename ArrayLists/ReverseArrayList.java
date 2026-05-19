import java.util.*;

public class ReverseArrayList {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
         ArrayList<Integer> reverse = new ArrayList<>();

        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        for(int i=list.size()-1;i>0;i--){
            reverse.add(list.get(i));

        }
        System.out.print(reverse);

    }
}


// import java.util.*;

// public class Main {

//     public static void main(String[] args) {

//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);

//         int start = 0;
//         int end = list.size() - 1;

//         while(start < end) {

//             int temp = list.get(start);

//             list.set(start, list.get(end));
//             list.set(end, temp);

//             start++;
//             end--;
//         }

//         System.out.println(list);
//     }
// }