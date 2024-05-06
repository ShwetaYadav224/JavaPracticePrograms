import java.util.*;
public class DRoot {
  public static int digital_root(int n) {
    int sum=0;
    while(n>0){
      int l=n%10;
      sum+=l;
      n/=10;
      }
  return sum;
  }
  

public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
int sum= digital_root(n);
  System.out.println(sum);
}
  }