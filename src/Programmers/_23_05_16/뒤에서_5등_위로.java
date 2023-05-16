package Programmers._23_05_16;

import java.util.*;
class Solution_뒤에서_5등_위로 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = new int[num_list.length - 5];

        for (int i = 0; i < num_list.length-5; i++) {
            answer[i] = num_list[i+5];
        }

        return answer;
    }
}
