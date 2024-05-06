import java.util.*;

public class Fact21 {
    public static long factO(int n){
        long fact=1;
            for(int j=1;j<=n;j++){
                
                fact*=j;
            }
            return fact;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();  
          long res= factO(n);
          System.out.println(res);
            
        }
    }

