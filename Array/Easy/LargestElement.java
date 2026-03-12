public class LargestElement {
    public static int largestElement(int []arr){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] a={9,1,2,3,7,4,8,6,5};
        int max=largestElement(a);
        System.out.println(max);
    }
}
