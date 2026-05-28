import java.util.*;
class NextGreaterElemment{
    static void nextGreater(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int n=arr.length;
        int[] result=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();            }
        
        if(stack.isEmpty()){
            result[i]=-1;

        }else{
            result[i]=stack.peek();
        }
        stack.push(arr[i]);   //current element can be useful for future elements so push
        }
        for(int num:result){
            System.out.print(num+" ");
        }

    }
    public static void main(String[] args){
        int[] arr={2,3,1,5,4};
        nextGreater(arr);
    }
}