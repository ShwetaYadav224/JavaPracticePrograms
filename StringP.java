public class StringP {
    public static int xyz(int x,int pow){
        if(pow==0){
            return 1;
        }
        int r= x*x;
        xyz(x,(pow-1));
      
        
        return r;
    }
    public static void main(String[] args) {

        System.out.println(xyz(10,5));

    }
}
