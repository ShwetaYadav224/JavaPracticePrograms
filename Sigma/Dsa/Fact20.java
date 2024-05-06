import java.util.*;
public class Fact20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char counter;
        do{
            System.out.println("Enter the Number-");
            int n=sc.nextInt();
             sc.nextLine();
       
         int fact=1;
        for(int i=1;i<=n;i++){
                    fact=fact*i;
            }
        System.out.println(fact);
       
     System.out.println("Enter the y for continue and n for not continue...");
      String input=sc.nextLine();
        counter=input.charAt(0);
        if(counter=='n'||counter=='N'){
            System.out.println("Thank you...");
            break;
        }

    }while(counter=='y'||counter=='Y');
        }
        
    
}
