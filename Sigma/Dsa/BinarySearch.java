import java.util.Scanner;

public class BinarySearch {
    public static int Binary(int key,int arr[]){
      int  start=0;
      int end=arr.length-1;
      while(start<=end){
       int mid=(start+end)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
      }
      return -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int key=sc.nextInt();
        int arr[]={12,23,43,55,66,77,87};
      
     int r=Binary(key,arr);
     if(r==-1){
   System.out.println("Not found");
     }
     else{
        System.out.println("Found at "+r);
     }
    }
}
