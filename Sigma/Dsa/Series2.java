import java.util.*;

public class Series2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0,a=9;i<n;i++,a+=4){
            System.out.println(a);
            sum=sum+a;

        } 
        System.out.print("="+sum);

    }
}
