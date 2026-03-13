public class SecondLargestElement {
     public static int secondLargestElement(int []arr){
        int largest=arr[0];
        int secondLargest=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            } 
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,9,4,9,6,5};
        int secondMax=secondLargestElement(a);
        System.out.println(secondMax);
    }
}
