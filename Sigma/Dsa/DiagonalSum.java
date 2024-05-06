import java.util.Scanner;

public class DiagonalSum {
    public static void PrimarySum(int arr[][],int n,int m){
        int sum=0;
        for(int i=0;i<n;i++){
        
               sum+=arr[i][i];
               if(i!=arr.length-1-i){
            sum+=arr[i][n-1-i];
                              

            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] []=new int[3][3];
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        PrimarySum(arr,n,m);
    }
}
