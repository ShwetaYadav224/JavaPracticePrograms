import java.util.*;
public class PracticeTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=10;
        for(int i=1;i<=s;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}
