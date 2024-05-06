import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=1;
        int n=sc.nextInt();
        int b=10;
        
            for(int j=1;j<=b;j++){
                for(int i=1;i<=n;i++){
                t=i*j;
                System.out.print(t+"\t");
            } 
           System.out.println(" ");
        }
    }
}

