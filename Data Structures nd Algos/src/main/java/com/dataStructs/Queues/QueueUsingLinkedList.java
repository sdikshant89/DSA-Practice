public class QueueUsingLinkedList {

    // We'll keep track of linked list's head and tail, move tail to add and remove head to
    // remove from queue
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{

        static Node head = null;
        static Node tail = null;

        // O(1)
        public boolean isEmpty(){
            return head == null && tail == null;
        }

        // O(1)
        public void add(int data){
            Node nd = new Node(data);
            if(isEmpty()){
                head = tail = nd;
                return;
            }
            tail.next = nd;
            tail = tail.next;
            // OR tail = nd;
        }

        // O(1)
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            int data = head.data;
            if(head.equals(tail)){
                head = tail = null;
            }else{
                head = head.next;
            }
            return data;
        }

        // O(1)
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
