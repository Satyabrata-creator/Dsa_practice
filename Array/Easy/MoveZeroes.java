public class MoveZeroes {
    public static void moveZeroes(int[] arr){
        int i=0;
        while(i<arr.length-1){
            if(arr[i]==0){
                int j=i+1;
                while(j<arr.length-1 && arr[j]==0){
                    j++;
                }
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
            }
            else{
            i++;
            }
        }
    for(int n:arr){
        System.out.println(n);
    }
}
       public static void main(String[] args) {
        int arr[]={0,1,0,3,1,0,98};
        moveZeroes(arr);
    }
}
