package Lesson_01;

/**
 * Lesson 01: Iterations
 * BinaryGap. Find longest sequence of zeros in binary representation of an integer.
 */

public class BinaryGap {
    public static int solution(int N) {
        int binaryGap = 0;

        while (N % 2 == 0) {
            N /= 2;
        }

        for (int i = 0; N > 0; N /= 2) {
            if (N % 2 == 0) {
                i++;
            } else {
                if (i > binaryGap) {
                    binaryGap = i;
                }
                i = 0;
            }
        }
        return binaryGap;
    }

    public static void main(String[] args) {
        System.out.println(solution(7));
    }
}
