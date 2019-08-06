package Lesson_03;

/**
 * Lesson 03: Time Complexity
 * PermMissingElem. Find the missing element in a given permutation.
 */

public class PermMissingElem {
    public static int solution(int[] A) {
        long N = A.length + 1;
        long total = N * (N + 1) / 2;

        for (int i : A) {
            total -= i;
        }
        return (int)total;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 4, 5}));
    }
}
