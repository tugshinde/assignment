
import java.util.*;

class student{
    String name;
    int rollno;
     static int total=0;
     student(String name ,int rollno){
        this.name=name;
        this.rollno= rollno;
        total++;


     }

     void display(){
        System.out.println("Student Name : "+name +" Student roll no : "+rollno);
     }
}
public class Q12 {
    public static void main(String[] arg){
        student s1 = new student("Vaibhav ", 100);
        student s2 = new student("Varad", 201);
        s1.display();
        s2.display();
        System.out.println("total "+student.total);

    }
    
}
