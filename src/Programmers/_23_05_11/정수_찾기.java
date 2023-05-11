package Programmers._23_05_11;

import java.util.*;

class Solution_정수_찾기 {
    public int solution(int[] num_list, int n) {
        boolean found = Arrays.stream(num_list).anyMatch(i -> i == n);
        return found ? 1 : 0;
    }
}