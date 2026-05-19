import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> common = new ArrayList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        // First list input
        for(int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }

        // Second list input
        for(int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }


        for(int i=0;i<list1.size();i++){
            if(list2.contains(list1.get(i))){
                if(!common.contains(list1.get(i))){
                    common.add(list1.get(i));
                }
            }
        
        }
        System.out.println(common);
    }
}