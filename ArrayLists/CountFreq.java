import java.util.*;

public class CountFreq{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int key = sc.nextInt();

        int count = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                count++;
            }
        }
         System.out.println("Frequency = " + count);
    }
}