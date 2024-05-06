import java.util.Scanner;

public class myPrime {
    public static boolean checkP(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;     
    }
public static void rangeP(int n){
for(int i=2;i<n;i++){
    if(checkP(i)){
System.out.print(i+" ");
    }
}
System.out.println();
}
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
rangeP(n);
  }  
}
