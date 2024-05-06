import java.util.Scanner;
public class TwoDArray {
    public static boolean search(int matrix[] [],int key,int n,int m){

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(matrix[i][j]==key){
                System.out.println("found at cell("+i+","+j+")");
               return true;
              }
            }
        }
        System.out.println("Not found");
        return false;
    }
    public static void largest(int matrix[] [],int n, int m){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[] []=new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i] [j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i] [j]+" ");
            }
            System.out.println();
        }
        int key=20;
        search(matrix, key,n, m);
        largest(matrix,n,m);
    }
    
}
