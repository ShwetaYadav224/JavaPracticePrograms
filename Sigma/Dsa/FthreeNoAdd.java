import java.util.Scanner;

public class FthreeNoAdd {
   public static int addThreeNo(int a ,int b ,int c){
       int sum= (a+b+c)/3;
       
       return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
      int res=  addThreeNo(n1,n2,n3);
      System.out.println(res);
    }
}
