
import java.util.Scanner;

public class LinearSerarch {
    public static int linearSearch(int []arr,int n){
        int i=-1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==n){
                return j;
            }
        }
        return i;
    }
    public static void main(String []args){
        int arr[]={0,1,0,3,1,0,98};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int index=linearSearch(arr,n);
        System.err.println("The index of the searched no. is: "+index);
    }
}
