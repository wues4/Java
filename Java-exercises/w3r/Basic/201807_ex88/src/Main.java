// Write a Java program to get the current system environment and system properties.

public class Main {
    public static void main(String[] args) {
        System.out.println("System environment:");
        System.out.println(System.getenv());
        System.out.println("System properties:");
        System.out.println(System.getProperties());
    }
}
