public class OopConcept {
   

    public static void main(String[] args) {
        Pen pen =new Pen();
        pen.setColor("blue");
       
        System.out.print(pen.getColor());
     
    }
}
class Student{
    String name;
    int roll;
    static String schoolName;
    void setName(String name1){
        this.name=name1;
    }
    String getName(){
        return this.name;
    }
}
class Pen{
    private class lid{
        String company="hi";
        
    }
    String color;
    int tip;
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public int getTip() {
        return this.tip;
    }
}
