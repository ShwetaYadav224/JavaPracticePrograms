public class Reverse {
    public static void ReverseP(int arr[]){
        int f=0;
        int l=arr.length-1;
        while (f<l) {
            int temp=arr[l];
            arr[l]=arr[f];
            arr[f]=temp;
            f++;
            l--;
        }
        
        
    }
    public static void main(String[] args) {
       int arr[]={12,34,45,67,89};
      ReverseP(arr); 
       for(int i=0;i<=arr.length-1;i++){
        System.out.println(arr[i]);
    }
    }
}
