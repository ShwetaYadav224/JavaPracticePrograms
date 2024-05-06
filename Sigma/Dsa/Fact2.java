import java.util.Scanner;

public class Fact2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1,a=9;i<=n;i++,a+=4){
            int fact=1;
            for(int j=1;j<=a;j++){
                fact=fact*j;
                sum=sum+fact;
            }
                
 } 
               System.out.println(sum);
        

    }
}
