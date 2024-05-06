import java.util.Scanner;

public class Fact3 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    for(int i=1,a=10;i<=n;i++,a--){
        int fact=1;
        for(int j=1;j<=a;j++){
            fact*=j;
        }
            sum+=fact;
            System.out.println(fact);
            
    }
    System.out.println(sum);
}
}
