public class TimeComplexity {
    public static void main(String[] args) {
        int n = 1000000; // Adjust the value of n for different test cases
        
        // Algorithm 1: Sum of integers using a loop
        long startTime1 = System.nanoTime();
        long sum1 = sumUsingLoop(n);
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1) / 1000000; // Convert nanoseconds to milliseconds
        
        System.out.println("Sum using loop: " + sum1);
        System.out.println("Time taken by Algorithm 1: " + duration1 + " milliseconds");
        System.out.println();
        
        // Algorithm 2: Sum of integers using a formula
        long startTime2 = System.nanoTime();
        long sum2 = sumUsingFormula(n);
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2) / 1000000; // Convert nanoseconds to milliseconds
        
        System.out.println("Sum using formula: " + sum2);
        System.out.println("Time taken by Algorithm 2: " + duration2 + " milliseconds");
    }
    
    // Algorithm 1: Sum of integers using a loop
    public static long sumUsingLoop(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    // Algorithm 2: Sum of integers using a formula
    public static long sumUsingFormula(int n) {
        return (long) n * (n + 1) / 2;
    }
}

