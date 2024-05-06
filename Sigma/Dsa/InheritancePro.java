public class InheritancePro{
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.breath();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("breaths");
    }

}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims");
    }
    void breath(){
        System.out.println("breaths2");
    }
}