import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {

    public static void main(String[] args) {
        Integer arr[]={7,65,4,32,43};
          //Arrays.sort(arr,2,5);
           Arrays.sort(arr,Collections.reverseOrder());//only work on object
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
