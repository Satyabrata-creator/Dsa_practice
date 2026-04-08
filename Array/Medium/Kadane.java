public class Kadane {
    public static void maxValue(int []a) {
        int max=a[0];
        int sum=a[0];
        for(int i=0;i<a.length;i++){
                sum+=a[i];
                if(sum<0){
                    sum=0;
                }
                if(sum>max){
                    max=sum;
                
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int a[]={2,3,-1,4,-4};
        maxValue(a);
    }
}
