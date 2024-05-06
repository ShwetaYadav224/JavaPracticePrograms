import java.util.Scanner;

public class Palindrome {
    public static void isPal(int n){
        int myValue=n;
        int rev=0;
        while(n>0){
             int l=n%10;
         rev=rev*10+l;
           
            n/=10;
        }
        
          if(rev==myValue){
            System.out.println("is Pal");
          }
          else{
            System.out.println("is not");
          }
return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     isPal(n);
    }
}
