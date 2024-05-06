import java.util.Scanner;

public class Pattern123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i,a=1;j<=n;j++,a++){
                System.out.print(a+"  ");

            }
            System.out.println();
        }
    }
}
