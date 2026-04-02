//find the element occuring more than half length

public class CountMax{
    public static void countMax(int []nums){
        int c=0;
        int element=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==element){
                c++;
            }
            if(nums[i]!=element && c>0){
                c--;
            }
            if(nums[i]!=element && c==0){
                c++;
                element=nums[i];
            }
        }
        System.out.println(element);

    }
    public static void main(String[] args) {
        int a[]={0,1,2,3,4,3,2,1,1,1,0,1,1,1,4,1,1,2,1,1,0};
        countMax(a);
    }
}