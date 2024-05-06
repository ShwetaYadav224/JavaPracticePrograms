import java.util.Scanner;

public class SumOfDigit {
  public static void SumOD(int n){
    int sum =0;
    while (n>0){
        int l=n%10;
        sum+=l;
        n/=10;
       
    }
     System.out.println(sum);
    return;
  }



    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        SumOD(n);

    }
}
