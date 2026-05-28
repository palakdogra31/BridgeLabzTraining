import java.util.*;
class MinStack{
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();

    void push(int value){
        stack.push(value);
        if(minStack.isEmpty() || value<=minStack.peek()){
            minStack.push(value);
        }
    }
    void pop(){
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }
    int getMin(){
        return minStack.peek();
    }
    public static void main(String[] args){
        MinStack ms=new MinStack();
        ms.push(5);
        ms.push(2);
        ms.push(10);
        ms.push(1);
        System.out.println(ms.getMin());
        ms.pop();
         System.out.println(ms.getMin());

    }
}
