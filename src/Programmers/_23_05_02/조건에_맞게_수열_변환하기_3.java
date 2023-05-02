package Programmers._23_05_02;

import java.util.Arrays;

class Solution_조건에_맞게_수열_변환하기_3 {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr)
                .map(n -> k % 2 == 1 ? n * k : n + k)
                .toArray();
    }
}
