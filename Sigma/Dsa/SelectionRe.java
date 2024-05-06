public class SelectionRe {
    public static void Selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                        minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;    
        }
        for(int s=0;s<arr.length;s++){
            System.out.print(arr[s]+" ");
        }
    }
    public static void main(String[] args) {
         int arr[]={12,23,11,21,34,};
         Selection(arr);
    }
}
