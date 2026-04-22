
class Messageprinter {
    public void printmessage(String msg) {



        
        System.out.print("[");

        System.out.print(msg);
        System.out.print("]");
    }
}

class Mythread implements Runnable {
    Thread t;
    Messageprinter mp;
    String msgtoprint;

    Mythread(Messageprinter mp, String msgtoString) {
        t = new Thread(this);
        this.mp = mp;
        this.msgtoprint = msgtoString;
        t.start();
    }

    public void run() {
        mp.printmessage(msgtoprint);
    }

}

public class nonsynchonization {
    public static void main(String[] args) {

        Messageprinter mp = new Messageprinter();
        Mythread mt1 = new Mythread(mp, "Hello");
    }

}
