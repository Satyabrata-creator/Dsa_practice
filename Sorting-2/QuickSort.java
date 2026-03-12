public class QuickSort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j>low){
                j--;
            }
            if(i<j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=pivot;
        arr[low]=temp;
        return j;
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int partition=partition(arr, low, high);
        quickSort(arr, low, partition-1);
        quickSort(arr, partition+1, high);
    }
        }
        
    public static void main(String[] args) {
         int[] a={9,1,2,3,7,4,8,6,5};
            quickSort(a,0,a.length-1);
            for (int i : a) {
                System.out.println(i);
            }
        }
    }
