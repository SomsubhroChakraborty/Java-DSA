package Queue;

import java.util.ArrayList;

public class Queue<T>{
    int front;
    int rear;
    int size;
    ArrayList<T> q;

    Queue(int n){
        q= new ArrayList<>(n);
        this.size=n;
        front=rear=-1;
    }

    //OverFlow condition
    public boolean isOverflow() throws Exception{
        if(rear == size-1){
            throw new Exception("The Queue is OverFlow");
        }
        return false;
    }

    // Underflow condition
    public boolean isUnderflow() throws Exception{
        if(front == rear){
            throw new Exception("The Queue is Empty");
        }
        return false;
    }

    //Enquue
    public void Enqueue(T x){
        try {
            if(isOverflow()){
 
            }
            else{
                q.add(++rear, x);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //Dequeue
    public T Dequeue(){
        T value =null;
        try {
            if(isUnderflow()){
 
            }
            else{
               value =  q.get(++front);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return value;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>(5);

        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
       System.out.println(q.Dequeue());
       System.out.println(q.Dequeue());
       System.out.println(q.Dequeue());
       System.out.println(q.Dequeue());
        
    }
}
