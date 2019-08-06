package Lesson_02;

import java.util.HashMap;

/**
 * Lesson 02: Arrays
 * OddOccurrencesInArray. Find value that occurs in odd number of elements.
 */

public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        int unpairedElement = 0;

        for (int i = 0; i < A.length; i++) {
            unpairedElement ^= A[i];
        }
        return unpairedElement;
    }

    public static int solution2(int[] A) {
        HashMap<Integer,Integer> occ = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(occ.containsKey(A[i]) && occ.get(A[i]) == 1){
                occ.remove(A[i]);
            }else{
                occ.put(A[i],1);
            }
        }
        for(int key : occ.keySet()){
            return key;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 4, 2, 1, 9, 5, 4, 5, 2, 2}));
        System.out.println(solution2(new int[]{1, 2, 4, 2, 1, 9, 5, 4, 5, 2, 2}));
    }
}
