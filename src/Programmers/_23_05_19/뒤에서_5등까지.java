package Programmers._23_05_19;

import java.util.*;

class Solution_뒤에서_5등까지 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        System.out.println(num_list);

        for (int i = 0; i < 5; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}