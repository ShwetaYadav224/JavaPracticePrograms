public class PracticeQSort {
    public static void BubbleSort(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1-i;j++){
             if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
             }
        }

    }
    for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
    }
    System.out.println();
    }

    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length-1;i++){
                 if(minPos>arr[j]){
                    arr[minPos]=arr[j];
                 }

            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
           
                   
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            }
    }
    public static void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        //BubbleSort(arr);
        //SelectionSort(arr);
        InsertionSort(arr);
    }

}
