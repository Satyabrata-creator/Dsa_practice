public class IsArraySorted {
    public static boolean sorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
        }
    public static void main(String []args){
        int[] a={1,2,3,4,5};
        boolean v=sorted(a);
        System.out.println(v);
    }
}
