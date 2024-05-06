import java.util.Scanner;

public class Pair {
    public static void PairN(int arr[]){
        int tp=0;
        for(int i=0;i<=arr.length-1;i++){
            int curr=arr[i];
            for(int j=i+1;j<=arr.length-1;j++){
                System.out.print("("+curr+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
     PairN(arr);
    }
}
