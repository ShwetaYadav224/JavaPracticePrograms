import java.util.*;
public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
             if(j==1 || j==n || i==1 || i==n){
            System.out.print("* ");
             }
             else{
                System.out.print("  ");
            }
            }
           
          System.out.println();
        }
    }
}
