public class PowXN {
    public static double myPow(double x, long n) {
        if(n==0){
            return 1;
        }
        if(n<0){
            double ans = 1/(myPow(x,-n));
            return ans;
        }
        if(n%2==0){
             return myPow(x * x, (int) (n/ 2));
            
        }
            return x * myPow(x, (int) (n - 1));
        
    }
    public static void main(String[] args) {
        System.out.println(myPow(2, 10));  
        System.out.println(myPow(2, -2));
    }

}
