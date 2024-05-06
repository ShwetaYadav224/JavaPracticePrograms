import java.util.*;

public class Fact4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        double sum=0;
        for(int i=1,a=1,d=9;i<=n;i++,a+=2,d+=4){
            double fact=1;
            for(int j=1;j<=d;j++){
                fact*=j;
                 
            }
           System.out.println("fact="+fact);
           sum = sum+(Math.pow(x, a))/fact;
        }
        System.out.println("sum="+sum);
    }
}
