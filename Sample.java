public class Sample {
    public static void main(String[] args) {
        int n = 10; // Change this value to get a different number of Fibonacci numbers

        int[] fibSeries = new int[n];
        fibSeries[0] = 0;
        fibSeries[1] = 1;

        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
        }

        // Reverse the array
        for (int i = 0; i < n / 2; i++) {
            int temp = fibSeries[i];
            fibSeries[i] = fibSeries[n - i - 1];
            fibSeries[n - i - 1] = temp;
        }

        // Print the Fibonacci series in reverse order
        for (int i = 0; i < n; i++) {
            System.out.print(fibSeries[i] + " ");
        }
    }
}
