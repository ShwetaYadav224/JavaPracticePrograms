import java.util.Scanner;
public class PrefixSum {
    public static void Maxsum(int arr[]){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
           prefix[i]=prefix[i-1]+arr[i];
           
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
         for(int j=i;j<arr.length;j++){
            int end=j;
            currsum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];


          if(currsum>maxSum){
            maxSum=currsum;
          }
         }  
        }
        System.out.println(maxSum);
    }
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("Enter 5 Numbers-");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    Maxsum(arr);
   }
}
