
import java.util.*;
public class Series7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double sum = 0;
       int n=10;
  for(int i=1,a=5;i<=n;i++,a*=5){
    System.out.println(a);
    sum =sum+(a);
  }
  System.out.println("Sum:"+sum);
    }
}
