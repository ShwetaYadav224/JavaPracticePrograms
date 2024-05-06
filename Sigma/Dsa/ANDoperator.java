import java.util.Scanner;

public class ANDoperator {
    public static int convertToBinary(int n){
        int i=0;
        int binary=0;
        while(n>0){
            int r=n%2;
            binary+=r*(int)Math.pow(10,i);
            n/=2;
            i++;    
        }
        return binary;
    }
    public static int convertToDecimal(int n){
        int i=0;
        int decimal=0;
        while(n>0){
         int l=n%10;
         decimal+=l*(int)Math.pow(2, i);
         n/=10;
         i++;
        }
        return decimal;
    }
    public static void formulaAnd(int n1,int n2){
        int res= convertToBinary(n1) & convertToBinary(n2);
        System.out.println(convertToDecimal(res));
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt(); 
       formulaAnd(n1 ,n2);

    }
}
