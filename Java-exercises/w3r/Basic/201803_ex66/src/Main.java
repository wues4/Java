// Write a Java program to compute the sum of the first 100 prime numbers.

public class Main {
    public static void main(String[] args) {
        int sum = 1;
        int numbers = 0;
        int n = 0;

        while (numbers<100) {
            n++;

            if (n%2 !=0) {
                if (isPrime(n)) {
                    sum+=n;
                    numbers++;
                }
            }
        }
        System.out.println("Result: " + sum);
    }

    private static boolean isPrime(int n){
        for (int i = 3; i*i<=n; i+=2) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}