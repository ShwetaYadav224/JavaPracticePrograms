

import java.util.*;
public class No1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=1,a=8;i<=n;i++,a-=2){
        for(int j=i;j<n;j++){
            System.out.print("  ");
        }
        for(int j=1;j<i;j++){
            System.out.print(a+" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(a+" ");
        }
System.out.println();
       }
    }
}

