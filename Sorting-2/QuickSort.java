import java.util.Scanner;

public class QuickSort {
    public static int partition(int []arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[pivot]>arr[i] && i<=high){
                i++;
            }
            while(arr[pivot]<arr[j] && j>=low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[pivot];
        arr[pivot]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void quickSort(int []arr,int low,int high){

        if(low>=high){
        return;
    }
        int partition=partition(arr,low,high);
        quickSort(arr, low, partition-1);
        quickSort(arr, partition+1, high);
    }
    public static void main(String []args){
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a=sc.nextInt();
        int []arr=new int[a];
        System.out.print("Enter the elements into the array");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The sorted array is");
        quickSort(arr,0,arr.length-1);
        for(int i : arr){
        System.out.println(i);
    
    }

}
}