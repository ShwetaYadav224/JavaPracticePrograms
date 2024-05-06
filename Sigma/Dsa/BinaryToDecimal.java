import java.util.Scanner;

public class BinaryToDecimal {
    public static void BinaryToDec(int n){
         int Mynum=n;
     int pow=0;
     int dec=0;
     while (n>0) {
       
        int l=n%10;
        dec=dec+(int)(l*Math.pow(2,pow));
        pow++;
        n/=10;  
     }
     System.out.print( Mynum+" "+dec);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        BinaryToDec(n);
    }
}
