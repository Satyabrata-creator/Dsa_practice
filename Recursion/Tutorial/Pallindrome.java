public class Pallindrome {
    public static int pallindrome(int n,int y){
        if(n==0){
            return y;
        }
        return pallindrome(n/10,n%10+y*10);

    }
    public static void main(String[] args) {
        int a=123456789;
        int b=12321;
        if(a==pallindrome(a,0)){
            System.out.println(a+"is pallindrome");
        }
        else
            System.out.println(a+" is not pallindrome");

        if(b==pallindrome(b,0)){
            System.out.println(b+" is pallindrome");
        }
        else
            System.out.println(b+"is not pallindrome");

    }
}
