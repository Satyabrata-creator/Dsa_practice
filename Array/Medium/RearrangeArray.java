class RearrangeArray {
    public static int[] rearrangeArray(int[] nums) {
        int []arr=new int[nums.length];
        int odd=1;
        int even=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[even]=nums[i];
                even+=2;
            }
            else{
                arr[odd]=nums[i];
                odd+=2;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int a[]={2, 4, 5, -1, -3, -4};
        a=rearrangeArray(a);
        for(int i:a)
        System.out.print(i+" ");
    System.out.println("");
    }
}