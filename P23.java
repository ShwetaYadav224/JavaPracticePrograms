public class P23 {
    public static void main(String[] args) {
        int n =10;
        printNumber(n);
        
    }
    public static void printNumber(int n){
        if(n==0){
            System.out.println(n);
          return;
        }
        System.out.println(n);
        printNumber(n-1);

    }
    
}
