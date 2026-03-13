public class LeftRotateArray {
    public static void leftRotate(int []arr) {
        int a=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=a;
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        leftRotate(a);
    }
}
