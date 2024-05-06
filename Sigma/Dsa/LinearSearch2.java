import java.util.Scanner;

public class LinearSearch2 {
    public static int linearS(int arr[],int key){
    for(int i=0;i<=arr.length-1;i++){
        if (key==arr[i]){
            return i;
        }
    }
    return -1;
    }
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int arr[]={20,12,23,32,34,45,21};
    int key=sc.nextInt();
   int r= linearS(arr, key);
    if(r==-1){
        System.out.println("not found");
    }
    else{
        System.out.println("Found at"+r);
    }

   } 
}
