import java.util.*;
class Leaders {
    public List<Integer> leaders(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(max<nums[i]){
                max=nums[i];
                list.add(max);
            }
    }
    Collections.reverse(list);
    return list;
    }
    public static void main(String[] args) {
        int a[]={16, 18, 4, 3, 5, -17,-26};
        Leaders l=new Leaders();
        List<Integer> list=l.leaders(a);
        for(int i:list)
        System.out.print(i+" ");
    System.out.println("");
}
}