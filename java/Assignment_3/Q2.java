// package java.Assignment_3;
import java.util.*;
class vechile{
    String brand;
    double speed;
    
    static{
        System.out.println("Fleet Management System ");
    }
    {
        System.out.println("New vehilce object created ");
    }
    vechile(){}
    vechile(String brand ,double speed){
        this.brand=brand;
        this.speed=speed;

    }
    void updatespeed(double speed ){
        this.speed = speed;
        System.out.println("Speed updated");
    }
    void display(){
        System.out.print("\nName of Brand : "+brand);
        System.out.print("\nSpeed of  "+brand+ " "+speed);
    }
}
class car extends vechile{
    String fuel;
    car(String brand,double speed,String fuel){
        super(brand,speed);
        this.fuel=fuel;
    }
    void display(){
        super.display();
        System.out.println("\nFuel Type : "+fuel);
    }

}
class Bike extends vechile{
    double mileage;
    Bike(String brand,double speed,double mileage){
        super(brand,speed);
        this.mileage=mileage;
    }
    void display(){
        super.display();
        System.out.println("\nMIleage :"+mileage);
    }
}



public class Q2 {
    public static void main(String[] args) {
        System.out.println("Hello");
car c=new car("Mahindra", 50, "Petrol");
c.display();
vechile b = new Bike("Tata",70,12);
b.display();
c.updatespeed(66);
b.updatespeed(90);
c.display();
b.display(); 


    }
    
}
