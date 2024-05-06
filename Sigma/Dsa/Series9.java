
import java.util.*;

public class Series9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
       double sum=0;
        for(int i=1,a=5,b=3;i<n;i++,a+=4,b+=2){
            sum+=(double)(x+Math.pow(a,2))/b;
             
        } 
        System.out.print("="+sum);

    }
}
