public class ReseveseR {
    public static void main(String[] args) {
        int i=0;
        int n=499;
        int r=0;
        while(n>0){
            int l=n%10;
            r=l+(r*10);
            i++;
            n/=10;

        }
        System.out.println(r);
    }
}
