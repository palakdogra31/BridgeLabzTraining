// import java.util.*;
// public class MergeTwoArrayLists{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         ArrayList<Integer> arr=new ArrayList<>();
//         ArrayList<Integer> arr2=new ArrayList<>();
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         for(int i=0;i<n;i++){
//             arr.add(sc.nextInt());

//         }
//          for(int i=0;i<m;i++){
//             arr2.add(sc.nextInt());

//         }

//         arr.addAll(arr2);
    
//         System.out.print(arr);

//     }
// }



import java.util.*;

public class MergeTwoArrayLists {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> merged = new ArrayList<>();
        

        System.out.print("Enter size of first ArrayList: ");
        int n = sc.nextInt();

        System.out.print("Enter size of second ArrayList: ");
        int m = sc.nextInt();

        System.out.println("Enter first ArrayList elements:");

        for(int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Enter second ArrayList elements:");

        for(int i = 0; i < m; i++) {
            arr2.add(sc.nextInt());
        }

        for(int i=0;i<arr.size();i++){
            merged.add(arr.get(i));
        }
        for(int i=0;i<arr2.size();i++){
            merged.add(arr2.get(i));
        }
        System.out.print(merged);



        
    }
}