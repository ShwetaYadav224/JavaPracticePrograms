import java.util.Scanner;

public class PrintPrimeNumbers {
    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        else if(n==2){
            return true;
        }
        else{
            for(int i=2;i<=(n-1);i++){
                if(n%i==0){
                    return false;
                }
            }

        }
        return true;
    }

    public static void printPrime(int n){
        for(int i=0;i<=n;i++){
            if(checkPrime(i)==true){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        printPrime(n);
    }
}
