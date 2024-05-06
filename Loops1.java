import java.util.*;
public class Loops1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Any Number-");
        int limit=sc.nextInt();
        for(int i=0;i<=limit;i++){
            if (i%2==0) {
                System.out.println(i);
            }
            
        }

    }
}
