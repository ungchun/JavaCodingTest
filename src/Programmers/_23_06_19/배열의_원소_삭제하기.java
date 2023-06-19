package Programmers._23_06_19;

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

class Solution_배열의_원소_삭제하기 {
    public int[] solution(int[] arr, int[] delete_list) {

        List<Integer> arr2 = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int val : delete_list) {
            if (arr2.contains(val)) {
                arr2.remove(Integer.valueOf(val));
            }
        }

        int[] answer = arr2.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}