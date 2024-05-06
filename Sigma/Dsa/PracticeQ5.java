public class PracticeQ5 {
    public static void main(String[] args) {
        Vehicle obj2=new Car();
        obj2.print();
        Vehicle obj1=new Vehicle();
        obj1.print();
    
    }

    
}
class Vehicle{
    void print(){
        System.out.println("Base class (vehicle)");
    }
}
class Car extends Vehicle{
    void print1(){
        System.out.println("child class");
    }
}
