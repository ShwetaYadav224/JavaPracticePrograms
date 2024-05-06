import java.util.Scanner;


public class HollowSquare {
public static void InvertedPy(int n){
    for(int i=1;i<=n;i++){
        for(int j=i;j<=n-1;j++){
            System.out.print("  ");

        }
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
            
        }
         System.out.println();
    }
   
}
public static void py(int n){
  int  counter=0;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            counter++;
            System.out.print(counter+"  ");

        }
         System.out.println();
    }
   
}
public static void py10(int n){
 
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if((j+i)%2==0){
   System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
        }
         System.out.println();
    }
   
}

public static void Inverted(int n){
    System.out.println();
    for(int i=1;i<=n;i++){
        for(int j=i, a=1;j<=n;j++,a++){
            System.out.print(a+" ");

        }
         System.out.println();
    }
   
}
    public static void Hq(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                 System.out.print("* ");
                }   
                else{
                    System.out.print("  ");
                }      
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Hq(n);
        InvertedPy(n);
        Inverted(n);
        py(n);
        py10(n);
    }
}
