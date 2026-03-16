public class MaxConsecutiveOnes {
    public static int maxConsecutive(int []nums){
        int maxi=0;
        int i=0;
        while(i<nums.length){
            int j=i;
            while(j<nums.length && nums[j]==1){
                j++;
            }
            if(j-i>maxi){
                maxi=j-i;
                i=j+1;
            }
            else{
                i++;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int a[]={1,0,1,1,1,1,1};
        int k=maxConsecutive(a);
        System.out.println(k);
    }
}
