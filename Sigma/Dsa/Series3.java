import java.util.*;
public class Series3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double sum = 0;
        int n= sc.nextInt();
         int x= sc.nextInt();
  for(int i=1,a=1;i<=n;i++,a++){
    System.out.println(a);
    sum =sum+Math.pow(x,a );
  }
  System.out.println("Sum:"+sum);
    }
}
