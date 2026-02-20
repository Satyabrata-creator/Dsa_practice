import java.util.Scanner;

public class InsertionSort {
    public static int[] insertionSort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            int key=arr[i+1];
            int j=i;
            while( j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
                arr[j+1]=key;
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
        insertionSort(arr);
        for(int i=0;i<a;i++){
        System.out.println(arr[i]);
        }
    }
}
