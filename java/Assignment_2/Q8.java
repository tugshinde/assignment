import java.util.*;

class Patient {
    int patientId;
    String name;
    int age;
    String disease;

    Patient(int patientId, String name, int age, String disease) {

        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;

    }

    void checkage() {
        if (this.age >= 60) {
            System.out.println(this.name + " is senior Citizen.");
        } else
            System.out.println(this.name + " is not senior Citizen.");
    }

    void display() {

        // System.out.println("Patient Id : "+patientId);
        // System.out.println("Patient Name is :"+name);
        System.out.printf("ID : %-5d | Name : %-15s | Age : %-3d | Disease : %-15s\n", patientId, name, age, disease);

    }

}

public class Q8 {
    public static void main(String[] arg) {
        System.out.println("----------------------Hospital Patients Details ----------------------------");
        Patient p1 = new Patient(1001, "Aniket Ghadge", 25, "Fever and cold");
        Patient p2 = new Patient(1002, "Amit shah", 65, "Hypertension");
        Patient p3 = new Patient(1003, "Suresh Raina ", 50, "Diabetes");
        p1.display();
        p1.checkage();
        System.out.println("-----------------------------------------------------------------------------");
        p2.display();
        p2.checkage();
        System.out.println("-----------------------------------------------------------------------------");
        p3.display();
        p3.checkage();
        System.out.println("-----------------------------------------------------------------------------");
    }

}
