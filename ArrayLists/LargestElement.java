import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }

        }
           System.out.println("Maximum = " + max);
    }
}