import java.util.*;
class BubbleSort{
    public static void bubbleSort(int[] arr){
        int i,j,n;
        n=arr.length;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        System.out.println("Sorted array:\n");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements in the array\n");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements into the array\n");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);

    }
}