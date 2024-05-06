import java.util.*;
public class Array {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
           marks[i] = marks[i]+2;
        }
    }
    public static void main(String args[]){
        int marks[]=new int[3];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("Physics="+marks[0]);
        System.out.println("Chemistry="+marks[1]);
         System.out.println("Biology="+marks[2]); 
       
         update(marks);
         for(int i=0;i<=marks.length;i++){
            System.out.println(marks[i]+" ");
         }
           int avg=(marks[0]+marks[1]+marks[2])/3; 
         System.out.println(avg);      
      sc.close();;

}
}