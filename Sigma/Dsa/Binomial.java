import java.util.Scanner;

public class Binomial {
    public static double facto(int n){
        double fact=1;
        for(int i=1 ;i<=n;i++){
          fact*=i;
        }
        return fact;
    }
    public static double coefficient(int n,int r){
        double factN=facto(n);
      double factR=facto(r);
      double factNr=facto(n-r);
        
         double c=(double)(factN/(factR*(factNr)));
        return c;
    }
    public static void main(String[] args) {    
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
     double result= coefficient(n, r);
     System.out.println(result);
    }
}
