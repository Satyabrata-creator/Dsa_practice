public class LongestSubarray {
       public static int longestSubarray(int[] nums,int k){
       int i=0;
       int j=0;
       int count=0;
       int sum=0;
       while(i<nums.length && j<nums.length){
        sum+=nums[j];
        j++;
        while(sum>k){
            sum-=nums[i];
            i++;
        }
        if(sum==k){
            if(count<j-i){
                count=j-i;
            }
        }
       }
        return count;
    }
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,3,4,4,5,9,5};
        int k=longestSubarray(a,14);
        System.out.println(k);
    }
}

// public class LongestSubarray {
//     public static int longestSubarray(int[] nums,int k){
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             int j=i;
//             while(sum<=k && j<nums.length){
//                 sum+=nums[j++];
//                 if(sum==k && j-i+1>count){
//                     count=j-i+1;
//                 }
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int a[]={1,1,2,2,3,3,4,4,5,9,5};
//         int k=longestSubarray(a, 14);
//         System.out.println(k);
//     }
