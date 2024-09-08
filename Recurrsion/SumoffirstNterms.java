// Sum of cubes of N natural numbers

class SumoffirstNterms {
    public static long sumOfSeries(long n) {
        long sum=0;
        sum=(n*(n+1)/2)*(n*(n+1)/2);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }

}