public class MergeSort {
    public static void mergeSort(int[] arr,int lb,int ub){
        if(lb>=ub){
            return;
        }
        int mid=(lb+ub)/2;
        mergeSort(arr,lb,mid);
        mergeSort(arr, mid+1, ub);
        merge(arr,lb,mid,ub);
    }
    public static void merge(int arr[],int lb,int mid,int ub){
        int[] temp=new int[ub-lb+1];
        int left=lb;
        int right=mid+1;
        int i=0;
        while(left<=mid && right<=ub){
            if(arr[left]<=arr[right]){
                temp[i]=arr[left];
                left++;
                i++;
            }
            else{
                temp[i]=arr[right];
                right++;
                i++;
            }
        }
        while(left<=mid){
            temp[i]=arr[left];
            left++;
            i++;
        }
        while(right<=ub){
            temp[i]=arr[right];
            i++;
            right++;
        }for(i=lb;i<=ub;i++){
            arr[i]=temp[i-lb];
        }
        
        }
        public static void main(String[] args){
            int[] a={9,1,2,3,7,4,8,6,5};
            mergeSort(a,0,a.length-1);
            for (int i : a) {
                System.out.println(i);
            }
        }
    }
