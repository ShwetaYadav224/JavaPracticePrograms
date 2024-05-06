import java.util.*;
public class Ab {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        switch (c) {
            case 1:
                int res=a+b;
                System.out.println("addition="+res);
                break;
            case 2:
                int res1=a-b;
                System.out.println("subtration="+res1);
                break;
            case 3:
                int res2=a/b;
                System.out.println("Division="+res2);
                break;
            case 4:
                int res4=a*b;
                System.out.println("Multiplication="+res4);
                break;    
        
            default:
            System.out.println("Invalid Choice");
                break;
        }
    }
}
