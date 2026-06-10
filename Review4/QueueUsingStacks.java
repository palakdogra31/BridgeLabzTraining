import java.util.Stack;
class QueueUsingStacks{
Stack<Integer> s1=new Stack<>();
Stack<Integer> s2=new Stack<>();
public void enqueue(int data){
s1.push(data);
}
public int dequeue(){
if(s1.isEmpty() && s2.isEmpty()){
System.out.println("queue is empty");
return -1;
}
if(s2.isEmpty()){
while(!s1.isEmpty()){
s2.push(s1.pop());
}
}
return s2.pop();
}
public int peek(){
if(s1.isEmpty() && s2.isEmpty()){
System.out.println("queue is empty");
return -1;
}
if(s2.isEmpty()){
while(!s1.isEmpty()){
s2.push(s1.pop());
}
}
return s2.peek();
}
public Boolean isEmpty(){
return s1.isEmpty() && s2.isEmpty();
}
public static void main(String[] args){
QueueUsingStacks q=new QueueUsingStacks();
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
System.out.println("front:" +q.peek());
System.out.println("dequeue:" +q.dequeue());
System.out.println("front after dequeue: "+ q.peek());
System.out.println("is empty:" + q.isEmpty());
}
}
