import java.util.*;
class StackUsingOneQueue{
    Queue<Integer> q=new LinkedList<>();
    public void push(int x){
        q.add(x);
        int size=q.size();
        for(int i=0;i<size-1;i++){
            q.add(q.remove());
        }
    }
    public int pop(){
        if(q.isEmpty()){
            System.out.println("stack empty");
            return -1;
        }
        return q.remove();
    }
    public int top(){
        if(q.isEmpty()){
            System.out.println("stack empty");
            return -1;
        }
        return q.peek();
    }
    public boolean empty(){
        return q.isEmpty();
    }
    
    public static void main(String[] args){
        StackUsingOneQueue stack =new StackUsingOneQueue();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        
    }
}
