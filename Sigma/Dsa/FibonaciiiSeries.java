import java.util.*;
public class FibonaciiiSeries {
    public static void series(int n){
        int a=0;
        int b=1;
        int temp;
        int i=1;
        while(i<=n){
            System.out.println(a);
            temp=a+b;
            a=b;
            b=temp;
            i++;
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        series(n);
    }
}
