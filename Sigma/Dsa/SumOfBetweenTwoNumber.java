import java.util.Scanner;

public class SumOfBetweenTwoNumber {
    public static void sumBetween(int n1,int n2){
        int start=Math.min(n1, n2);
        int end=Math.max(n1,n2);
        int res=(end-start+1)*(start+end)/2;
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sumBetween(n1,n2);

    }
}
