public class queue {
    int max =100;
    int queue []= new int[max];
    int rear = -1;
    boolean isEmpty(){
        return rear ==-1;
    }
    boolean isFull(){
        return rear == max-1;
    }
    //add
    void enqueue(int data){
        if (isFull()) {
            System.out.println("Queue is full");

            
        }else 
            rear++;
        queue [rear]=data;
        System.out.println(data +" is added in queue");
    }
    void dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            
        }
            int front =queue[0];
            for (int i =0;i<rear;i++){
                queue[i]=queue[i+1];
            }
            rear --;
            System.out.println(front +" is removed ");
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(10);
        q.enqueue(80);
        q.dequeue();

        
    }
    
}
