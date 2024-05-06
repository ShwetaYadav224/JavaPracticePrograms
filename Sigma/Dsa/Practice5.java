import java.util.*;
public class Practice5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice) {
                case 1:System.out.println("hey Its monday!!!");
                break;
                case 2:System.out.println("hey Its Tuesday!!!");
                break;
                case 3:System.out.println("hey Its Wedseday!!!");
                break;
                case 4:System.out.println("hey Its Thusday!!!");
                break;
                case 5:System.out.println("hey Its Friday!!!");
                break;
                case 6:System.out.println("hey Its Satureday!!!");
                break;
                case 7:System.out.println("hey Its Sunday!!!");
                break;
                default:System.out.println("Not applicable...");
        }
    }
}
