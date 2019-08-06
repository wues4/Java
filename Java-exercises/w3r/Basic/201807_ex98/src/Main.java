// Write a Java program to check if the value 20 appears three times and no 20's are next to each other in an given array of integers.

public class Main {
    public static void main(String[] args) {
        int[] array1 = {20, 70, 10, 50, 20, 13, 50};
        int[] array2 = {20, 10, 20, 50, 80, 13, 20};
        int[] array3 = {10, 30, 20, 20, 80, 13, 90};

        checkArrayContain20(array1);
        checkArrayContain20(array2);
        checkArrayContain20(array3);

    }

    private static void checkArrayContain20(int[] ints){
        int twenty = 20;
        int count20 = 0;

        if(ints.length >= 1 && ints[0] == 20)
            count20++;

        for (int i = 1; i<ints.length; i++) {
            if (ints[i-1] == twenty && ints[i] == 20) {
                System.out.println("False");
                return;
            }
            if (ints[i] == twenty)
                count20++;
        }
        System.out.println("20 appears: " + count20);
    }
}
