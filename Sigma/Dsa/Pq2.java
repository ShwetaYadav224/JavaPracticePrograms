import java.util.*;
public class Pq2{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     while (n>0) {
        int l= n%10;
        System.out.print(l);
        n=n/10;
        
     }
    }
}