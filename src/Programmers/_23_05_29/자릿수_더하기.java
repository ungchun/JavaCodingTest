package Programmers._23_05_29;

import java.util.*;

class Solution_자릿수_더하기 {
    public int solution(int n) {
        int answer = 0;

        String val = String.valueOf(n);
        String[] arr = val.split("");

        for (String value : arr) {
            answer += Integer.parseInt(value);
        }
        return answer;
    }
}
