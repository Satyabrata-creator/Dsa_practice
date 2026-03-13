
import java.util.Scanner;

public class RotatearrayK {
     public static void leftRotatek(int []arr,int k) {
        if(k>=arr.length){
            System.out.println("Size of the k must be less than size of array");
            return;
        }
        int[] arr1=new int[k];
        for(int i=0;i<k;i++){
            arr1[i]=arr[i];
        }
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }
        int n=arr.length;
        for(int i=0;i<k;i++){
            arr[n-k+i]=arr1[i];
        }
        for(int i:arr){
            System.out.println(i);
        }
        }
    public static void rightRotatek(int []arr,int k){
        int n=arr.length;
        int arr2[]=new int[k];
        for(int i=0;i<n-k;i++){
            arr2[i]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=arr[i+n-k];
        }
        for(int i=k;i<n;i++){
            arr[i]=arr2[i-k];
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the k and rotateDir");
        int k=sc.nextInt();
        String s=sc.next();
        if(java.util.Objects.equals(s, "Left"))
            leftRotatek(a, k);
        else if(java.util.Objects.equals(s,"Right")){
            rightRotatek(a, k);
        }
    }
}

