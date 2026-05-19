import java.util.*;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int even=0;
        int odd=0;
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for(int i=0;i<list.size();i++){
            if(list.get(i) % 2 ==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.print(even + " " + odd);
    }
}