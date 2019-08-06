// Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.

public class Main {
    public static void main(String[] args) {
        System.out.println(System.getenv("PATH"));
        System.out.println(System.getenv("TEMP"));
        System.out.println(System.getenv("USERNAME"));
    }
}
