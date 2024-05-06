import java.util.Scanner;

public class DecimalToBinary {
    public static void DtoB(int D){
    int pow=0;
    int Binary=0;
    while(D>0){
        int l=D%2;
        Binary=Binary+(l*(int)Math.pow(10, pow));
        pow++;
        D/=2;
 

    }
    System.out.println(Binary);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        DtoB(n);
    }
}
