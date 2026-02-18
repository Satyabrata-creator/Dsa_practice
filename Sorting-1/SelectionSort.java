import java.util.*;
public class SelectionSort {
    public static int[] selection(int []arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a=sc.nextInt();
        int []arr=new int[a];
        System.out.print("Enter the elements into the array");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The sorted array is");
        selection(arr);
        for(int i=0;i<a;i++){
        System.out.println(arr[i]);
        }
    }
}
