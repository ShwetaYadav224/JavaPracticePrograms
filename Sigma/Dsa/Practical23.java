public class Practical23 {
    public static void main(String[] args) {
      //  int n =5;
       // int arr[]={10,20,30,70,70,50};
        //int f=70;
       //System.out.println(isOcc(arr, 0,f));
      // System.out.println(fib(n));     
    //  boolean re= isSorted(arr,0);
    //  System.out.println(re);
    System.out.println(powerN(10,4));
    }
    public static void printNumber(int n){
        if(n==0){
            System.out.println(n);
          return;
        }
        System.out.println(n);
        printNumber(n-1);

    }
    public static int fib(int n) {
        if(n==0  || n==1){
          return n;
        }
       int fnm1=fib(n-1);
       int fnm2=fib(n-2);
       int fn=fnm1+fnm2;
       return fn;
    }
    public static boolean isSorted(int arr[],int i){
      if(i==arr.length-1){
        return true;
      }
      if(arr[i]>arr[i+1]){
        return false;
      }
     return  isSorted(arr,i+1);
    }
    public static int isOcc(int arr[],int i,int n){
        if(i==arr.length){
            return -1;
        }
    int isFound= isOcc(arr, i+1, n); 
    if(isFound==-1 && arr[i]==n){
        return i;
    }
    return isFound;

    }
    public static int powerN(int n,int pow) {
        if(pow==0){
            return 1;
        }
        int x= powerN(n,(pow/2))*powerN(n,(pow/2));
        if(pow%2!=0){
           return n*x;
        }
        return x;
    }
}
