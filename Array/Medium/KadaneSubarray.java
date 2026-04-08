public class KadaneSubarray {
    public static void printArray(int []a) {
        int max=a[0];
        int sum=a[0];
        int li=0;
        int i=0;
        int j=0;
        while(i<a.length){
                sum+=a[i];
                i++;
                if(sum<0){
                    sum=0;
                    j=i;
                }
                if(sum>max){
                    max=sum;
                    li=i;
                
            }
        }
        for(int k=j;k<li;k++){
            System.out.println(a[k]);
        }
    }
    public static void main(String[] args) {
        int a[]={2,3,-1,4,-4};
        printArray(a);
    }
}
