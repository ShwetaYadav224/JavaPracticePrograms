import java.util.Scanner;

public class TrappedWater {
    public static int trappedWater(int height[]){
        int n=height.length;
//calculate left max boundary
int leftMaxB[]= new int[n];
leftMaxB[0]=height[0];
for(int i=1;i<n;i++){
    leftMaxB[i]=Math.max(height[i], leftMaxB[i-1]);
}

//calculate right max boundary
int rightMaxB[]= new int[n];
rightMaxB[n-1]=height[n-1];
for(int i=n-2;i>=0;i--){
    rightMaxB[i]=Math.max(height[i],rightMaxB[i+1]);

}
int trappedWater=0;
for(int i=0;i<n;i++){
    int waterlevel=Math.min(rightMaxB[i],leftMaxB[i]);
    trappedWater+=waterlevel-height[i];
}
return trappedWater;


//loop
//waterlevel= min(left max boundary+rightmax boundary)  
//trapped water=waterLevel-height[i]
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many numbers you want in array-");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter "+ n +" in array");
    for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
    }
    int max =trappedWater(arr);
    System.out.println(max);
    }
}
