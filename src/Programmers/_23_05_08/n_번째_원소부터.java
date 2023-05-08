package Programmers._23_05_08;

import java.util.*;

class Solution_n_번째_원소부터 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = n - 1; i < num_list.length; i++) {
            result.add(num_list[i]);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}