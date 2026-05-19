import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        System.out.print("Enter element: ");
        int element = sc.nextInt();

        list.add(index, element);

        System.out.println(list);

        sc.close();
    }
}