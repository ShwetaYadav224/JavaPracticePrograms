import java.util.*;
public class Rev{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
  int rev=0;
  while(n>0){
    int l=n%10;
    rev=(rev*10)+l;
    n/=10;
  }
        System.out.println(rev);
     }
    }
