import java.util.Scanner;

public class MaxSumOfArray {
    public static void MaxSum(int arr[]){
      int curr_sum=0;
       int maxS=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
          
        for(int j=i;j<arr.length;j++){
            curr_sum=0;
            for(int k=i;k<=j;k++){
                curr_sum+=arr[k];
            }
             System.out.println(curr_sum);
             if(curr_sum>maxS){
                maxS=curr_sum;
             }
        }
       }
       System.out.println("Max Sum="+maxS);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        MaxSum(arr);
    }
}
