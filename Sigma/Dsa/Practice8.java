
import java.util.*;
public class Practice8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double sum = 0;
        StringBuilder sb= new StringBuilder();
        int n=10;
        for(int i=1,a=2;i<=n;i++,a*=3){
     if(i%2==0){
        sum=sum+a;
            if(i!=n){
                    sb.append(a).append("-");
                    }     
                }
     else{ 
        sum =sum-(a);
            if(i!=n){
                    sb.append(a).append("+");
                    } 
                }
}
if (sb.length() > 0) {
    sb.deleteCharAt(sb.length() - 1);
}

    System.out.println(sb.toString());
System.out.println("Sum:"+sum);
    }
    
}