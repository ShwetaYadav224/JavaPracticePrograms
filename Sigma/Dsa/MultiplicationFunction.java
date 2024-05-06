import java.util.*;

public class MultiplicationFunction {
    public static int multiPlication(int n1,int n2){
        int product= n1*n2;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();
       int prod= multiPlication(n1,n2);
         System.out.println(prod);

    }
} 
