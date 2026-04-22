// import java.util.*;
import java.util.*;
// import javax.swing.text.html.HTMLDocument.Iterator;

public class linklistdemo {
    public static void main(String [] arg ){
        ArrayList<String> list1 =new ArrayList<>();
        list1.add("Tushar");
        list1.add("Vaibhav");
        list1.add("aniket ");
        for (String s : list1){
            System.out.println(s);
        }
        //using iterator
        System.out.println("Using iterator :");
        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            // String name = it.next();
            System.out.println(it.next());
            
        }


    }
    
}
