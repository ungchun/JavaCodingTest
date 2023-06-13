package Programmers._23_06_13;

import java.util.*;
class Solution_접미사_배열 {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();

        String[] check = my_string.split("");
        String temp = my_string;
        answer.add(temp);
        for (int i = 0; i < check.length-1; i++) {
            temp = temp.substring(1);
            answer.add(temp);
        }

        // Collections.sort(answer, Collections.reverseOrder());
        answer.sort(String.CASE_INSENSITIVE_ORDER);

        return answer.toArray(new String[answer.size()]);
    }
}
