package Programmers._23_05_30;

import java.util.*;
class Solution_배열의_원소만큼_추가하기 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];

            for (int j = 0; j < val; j++) {
                list.add(val);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}