import java.util.*;
public class Practice3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        float pen=sc.nextFloat();
        float pencil=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total= pen+pencil+eraser;
        float gst=total+(total*0.18f);
        System.out.println(gst);
    }
}
