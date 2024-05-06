import java.util.*;
public class SellBuyStock {
public static void stockMarket(int arr[]){
    int buyPrice=Integer.MAX_VALUE;
    int maxProfit=0;
    for(int i=0;i<arr.length;i++){
        if(buyPrice<arr[i]){
            int profit=arr[i]-buyPrice;
            maxProfit=Math.max(maxProfit, profit);

        }
        else{
            buyPrice=arr[i];
        }
    }
    System.out.println(maxProfit);
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        stockMarket(arr);
    }
}
