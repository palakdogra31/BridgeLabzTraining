import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> unique = new ArrayList<>();

        int n = sc.nextInt();

        // Input
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Remove duplicates
        for(int i = 0; i < list.size(); i++) {

            if(!unique.contains(list.get(i))) {

                unique.add(list.get(i));
            }
        }

        System.out.println(unique);

        sc.close();
    }
}