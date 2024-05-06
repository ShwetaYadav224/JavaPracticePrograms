import java.util.Scanner;
public class PrintSubArray {
    public static void SubArray(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int start=i;
            for(int j=i;j<=arr.length-1;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Print 5 number-");
        int arr[]=new int[5];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        SubArray(arr);
    }
}
