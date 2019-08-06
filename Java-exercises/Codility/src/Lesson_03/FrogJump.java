package Lesson_03;

/**
 * Lesson 03: Time Complexity
 * FrogJmp. Count minimal number of jumps from position X to Y.
 */

public class FrogJump {
    public static int solution(int X, int Y, int D) {
        int diff = Y - X;
        if (diff % D == 0)
            return diff /D;
        else
            return diff/D + 1;
    }

    public static int solution2(int X, int Y, int D) {
        return (int) Math.ceil((float)(Y -X)/D);
    }

    public static void main(String[] args) {
        System.out.println(solution(15, 140, 20));
        System.out.println(solution2(15, 140, 20));
    }
}
