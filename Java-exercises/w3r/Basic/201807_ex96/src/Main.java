// Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array.

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,10,5,15,20,18};
        int[] array2 = {20,5,15,8,1,3};
        int[] array3 = {6,1,8,10,4,7};

        checkIfArrayContains10And20(array1);
        checkIfArrayContains10And20(array2);
        checkIfArrayContains10And20(array3);
    }

    private static void checkIfArrayContains10And20(int[] ints){
        int x=10, y=20;
        boolean check = false;

        for (int i : ints) {
            if (i == x) {
                check = true;
            }

            if (check && i == y) {
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }
}
