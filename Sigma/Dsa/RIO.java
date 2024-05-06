public class RIO {
    public static void IncreaingNumbers(int n){
     if(n==1){
        System.out.println(n);
        return;
     }
    
     IncreaingNumbers(n-1);
     System.out.println(n);

    }
    public static int factorial(int n){
      if(n==0){
        return 1;
      }
      int fnmn=factorial(n-1);
      int fc=fnmn*n;
      return fc;

    }
    public static int sumofnaturalnumber(int n){
       if(n==0){
        return 0;

       }
       int m=sumofnaturalnumber(n-1);
     int sum=m+n;
     return sum;

    }
public static int fib(int n){
    if((n)==1 || (n)==0){
     return n;
    }
    int fm1=fib(n-1);
    int fm2=fib(n-2);
    int fn=fm1+fm2;
    return fn;
}
    public static void main(String[] args) {
        int n=2;
        //IncreaingNumbers(n);
        //System.out.println(factorial(n));
        //System.out.println(sumofnaturalnumber(n));
        System.out.println(fib(n));
    }
}
