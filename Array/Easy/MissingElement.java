public class MissingElement {
    public static int findMissing(int []nums){
        int sum=0;
        int totalSum=nums.length*(nums.length+1)/2;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return (totalSum-sum);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int k=findMissing(a);
        System.out.println(k);
    }
}
