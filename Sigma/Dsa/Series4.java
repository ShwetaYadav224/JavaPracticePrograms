import java.util.*;
public class Series4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double sum = 0;
        int n= sc.nextInt();
        
  for(int i=1,a=9;i<=n;i++,a+=4){
    System.out.println(a);
    sum =sum+Math.pow(a,2 );
  }
  System.out.println("Sum:"+sum);
    }
}
