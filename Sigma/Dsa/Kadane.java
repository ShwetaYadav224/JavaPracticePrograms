import java.util.Scanner;

public class Kadane {
    public static void mxSum(int arr[]){
     int mc=Integer.MIN_VALUE;
     int cs=0;
     for(int i=0;i<arr.length;i++){
        cs=cs+arr[i];
        if(cs<0){
            cs=0;
        }
        mc= Math.max(cs, mc);
     }     
     System.out.println(mc); 

    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("How many numbers you want in array-");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter "+ n +" in array");
    for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
    }
    mxSum(arr);
    }
}
