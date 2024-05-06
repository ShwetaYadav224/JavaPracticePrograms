import java.util.*;
public class Pr21 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int oddSum=0;
        int evenSum=0;
        char counter;
        int n;

        do{
            System.out.println("Enter the no=");
            n=sc.nextInt();
            sc.nextLine();
            if(n%2==0){
                evenSum+=n;
            }
            else{
             oddSum+=n;
            }
            System.out.println("enter 'y' for continue and 'n' for Not continue" );
          String input=sc.nextLine();
          counter=input.charAt(0);
            if(counter=='n'||counter=='N'){  
            System.out.println("Sum is given below");
            break;
            }
        }while(counter=='y'||counter=='Y');
        System.out.println("oddSum="+oddSum);
        System.out.println("evenSum="+evenSum);
    }
}
