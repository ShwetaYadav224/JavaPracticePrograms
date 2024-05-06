public class pc {   
    public static int xyz(int x,int pow){
        if(pow==1){
            return 10;
        }
        int r= x*xyz(x,(pow-1));
        return r;
    }
    public static void main(String[] args) {

        System.out.println(xyz(10,5));

    }
}
