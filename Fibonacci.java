public class Fibonacci {
    /**
     * Calculates the nth term of Fibonacci sequence recursively.
     * @param n The position in the Fibonacci sequence
     * @return The nth term of the Fibonacci sequence
     */
    public static int fibonacci(int n){
        if (n<=1) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
        }
        //Main method remains the sane
    public static void main( String[] args){
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The"+n+"th term of the Fibonacci sequence is"+result+".");
    }
}