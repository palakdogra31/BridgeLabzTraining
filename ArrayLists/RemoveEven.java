import java.util.*;
public class RemoveEven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        for(int i=0;i<list.size();i++){
            if(list.get(i) % 2 ==0){
                list.remove(i);
                i--;
            }
        }
          System.out.println(list);
    }
}