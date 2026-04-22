
import java.util.*;
class Mythread extends Thread{

    public void run(){System.out.println(Thread.currentThread().getName()+"....Thread started");

    }
    

}
public class threaddemo {
public static void main(String[] args) {
    Mythread mt1 = new Mythread();
    mt1.run();
    mt1.start();
}
    
}
