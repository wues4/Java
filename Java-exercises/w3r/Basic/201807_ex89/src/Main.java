// Write a Java program to check whether a security manager has already been established for the current application or not.

public class Main {
    public static void main(String[] args) {
        System.out.println("Checking security manager ...");
        System.out.println(System.getSecurityManager());
    }
}
