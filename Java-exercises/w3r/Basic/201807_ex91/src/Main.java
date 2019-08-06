// Write a Java program to measure how long some code takes to execute in nanoseconds.

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        for (int i = 0; i<100; i++)
            System.out.println(i);

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Measured time in nanoseconds: " + estimatedTime);
    }
}
