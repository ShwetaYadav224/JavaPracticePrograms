import java.util.Scanner;

public class ArmstrongNumber {
   public static boolean armstrongNumber(int n){
    int originalNumber=n;
    int count=0;
    int sum=0;
    while(n>0){
        count++;
        n/=10;
    }
    n=originalNumber;
    while(n>0){
    int l=n%10;
    sum+=Math.pow(l,count);
    n/=10;
    }
    if(originalNumber==sum){
        return true; 
    }
    else{
        return false;
    }

   }
   public static void checkArmstrongNum(int n){
    for(int i=10;i<=n;i++){
        if(armstrongNumber(i)==true) {
            System.out.println(i);       
        }
    }
   }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        checkArmstrongNum(n);
    }
}
