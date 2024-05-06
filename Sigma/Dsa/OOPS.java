public class OOPS {
    public static void main(String[] args) {
        Student s1= new Student();//created Student object s1
        s1.setAge(23);
        System.out.println(s1.age);
    }
    
}
class Student{
    String name="Shweta";
    int age=22;
    String branch="CSE";
    void setAge(int newAge){
        age=newAge;
    }

}