import java.util.*;
public class SwapTwoNoFun {

public static int swap(int a,int b){
       int temp=a;
          a=b;
          b=temp;
           System.out.println(a);
          System.out.println(b);
          return 2;  
}
    public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int num1=sc.nextInt();
          int num2=sc.nextInt();
          
          swap(num1,num2);
          
          //call by value

    }
}
