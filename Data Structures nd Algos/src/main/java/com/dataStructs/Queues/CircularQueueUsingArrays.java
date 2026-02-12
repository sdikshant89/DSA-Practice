package main.java.com.dataStructs.Queues;

public class CircularQueueUsingArrays {

    // front and rear both moves, when an element is removed front is moved to +1, instead of
    // moving all the array elements to the front

    public static class Queue{
        int[] arr;
        int size;
        int front;
        int rear;

        Queue(int n){
            front = -1;
            rear = -1;
            size = n;
            arr = new int[n];
        }

        public boolean isEmpty(){
            // why?
            return rear == -1 && front == -1;
        }

        public boolean isFull(){
            return (rear+1)%size == front;
        }

        // O(1)
        public void add(int data){
            if(isFull()){
                System.out.println("Queue Full");
                return;
            }
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        // O(1)
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            int rem = arr[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }else{
                front = (front+1)%size;
            }
            return rem;
        }

        // O(1)
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            return arr[front];
        }

        public static void main(String[] args) {
            Queue q = new Queue(3);
            q.add(1);
            q.add(2);
            q.add(3);
            System.out.println(q.remove());
            q.add(4);
            System.out.println(q.remove());
            q.add(5);

            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}
