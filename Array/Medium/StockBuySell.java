public class StockBuySell {
    public static int stockValue(int a[]) {
        int min=a[0];
        int max=0;
        for(int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
            else{
                max=Math.max(max, a[i]-min);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]={10, 7, 5, 8, 11, 9};
        int max=stockValue(a);
        System.out.println("Max value "+max);
    }
}
