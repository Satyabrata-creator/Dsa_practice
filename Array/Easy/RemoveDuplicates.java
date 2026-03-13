public class RemoveDuplicates {
    public static int removeDuplicates(int []arr){
        int k=0;
        for(int i=1;i<arr.length;i++){
            if(arr[k]!=arr[i]){
                arr[++k]=arr[i];
            }
        }
        return k+1;
    }
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,4,4,5,5};
        int k=removeDuplicates(a);
        System.out.println(k);
    }
}
