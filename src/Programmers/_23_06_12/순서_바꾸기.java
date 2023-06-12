package Programmers._23_06_12;

import java.util.*;

class Solution_순서_바꾸기 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> tempArr = new ArrayList<>();

        for (int i = n; i < num_list.length; i++) {
            tempArr.add(num_list[i]);
        }

        for (int i = 0; i < n; i++) {
            tempArr.add(num_list[i]);
        }

        return tempArr.stream().mapToInt(x -> x).toArray();
    }
}