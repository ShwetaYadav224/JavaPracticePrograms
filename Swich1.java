import java.util.*;

public class Swich1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number-");
        int num1=sc.nextInt();
        System.out.println("enter second number-");
        int num2=sc.nextInt();
        System.out.println("Choose operation-1)Addition 2)Subtraction 3)Multiplication 4)Division");
        int operation=sc.nextInt();
        switch (operation) {
            case 1:
                int result =num1+num2;
                System.out.println(result);
                break;
        case 2:
                int result1 =num1-num2;
                System.out.println(result1);
                break;
        case 3:
                int result2 =num1*num2;
                System.out.println(result2);
                break;
        case 4:
                double result3 =num1/num2;
                System.out.println(result3);
                break;
            default:
            System.out.println("Error");
                break;
        }
    }
}
