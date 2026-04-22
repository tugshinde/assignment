public class stackarray {
    int max =100;
    int [] stack = new int[max];
    int top =-1;

    boolean isEmpty(){
        return top ==-1;
    }
    boolean isFull(){
        return top == max-1;
    }
    void push (int  data){
        if (isFull()) {
            System.out.println("Stack is full");
            
        }
        else top++;
        stack[top]= data;
        System.out.println(data+" is added in stack ");
    }
    void pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            
        }
       
        System.out.println(stack[top]+" removed fom stack");
         top--;

    }
    void peek(){
         if (isEmpty()) {
            System.out.println("Stack is empty");
            
        }
       
        System.out.println(stack[top]+" is at top");

    }

   

    public static void main(String[] args) {
       stackarray s = new stackarray();
       s.push(50);
       s.push(60);
       s.push(44);
       s.pop();
       s.peek();

    }

}
