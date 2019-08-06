package Lesson_03;

/**
 * Lesson 03: Time Complexity
 * TapeEquilibrium. Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 */

public class TapeEquilibrium {
    public static int solution(int[] A) {

        long sumright = 0;
        long sumleft = 0;
        long ans;

        for (int i =1;i<A.length;i++)
            sumright += A[i];

        sumleft = A[0];
        ans =Math.abs(Math.abs(sumright)+Math.abs(sumleft));

        for (int P=1; P<A.length; P++)
        {
            if (Math.abs(Math.abs(sumleft) - Math.abs(sumright))<ans)
                ans = Math.abs(Math.abs(sumleft) - Math.abs(sumright));
            sumleft += A[P];
            sumright -=A[P];
        }
        return (int) ans;

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5}));
    }
}