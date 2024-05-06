import java.util.*;
public class LargestNumberInArray {
    public static int getLargest(int list[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<list.length;i++){
            if(largest<list[i]){
              largest=list[i];
           
            }
            if(smallest>list[i]){
               smallest=list[i];
               
            }
        }
        System.out.println(smallest+"is smallest");
         return largest;
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter only 5 Numbers!!!");
    int list[]=new int[5];
    list[0]=sc.nextInt();
    list[1]=sc.nextInt();
    list[2]=sc.nextInt();
    list[3]=sc.nextInt();
    list[4]=sc.nextInt();
    sc.close();
      int l=getLargest(list);
      System.out.println(l+" is largest number in array");
}
    
}