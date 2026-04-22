import java.util.*;

public class collection {

    public static void display(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        List<String> list1 = new LinkedList<>();
        list1.add("Rohit");
        list1.add("Vaibhav");
        list1.add("Ruturaj");
        display(list1);
        System.out.println(list1.get(1));
        // list1.get(1)

    }

}
