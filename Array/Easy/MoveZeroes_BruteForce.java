

public class MoveZeroes_BruteForce {
    public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int zeroes=0;
        for(int i=0;i<n-zeroes;i++){
            if(nums[i]==0 && i+1!=n){
                zeroes++;
                for(int j=i+1;j<n-zeroes+1;j++){
                    nums[j-1]=nums[j];
                }
            }
        }
        for(int i=n-zeroes;i<n;i++){
            nums[i]=0;
        }
        for(int i:nums){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,1,0,98};
        moveZeroes(arr);
    }
}
