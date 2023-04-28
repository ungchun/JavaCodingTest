package Programmers._23_04_07;

import java.util.*;

class Solution_삼각형의_완성조건_2 {
    public int solution(int[] sides) {
        int answer = 0;

        int max = Arrays.stream(sides).max().getAsInt();
        int beforeAddValue = sides[0] > sides[1] ? sides[1] : sides[0];
        beforeAddValue = max - beforeAddValue + 1;
        while (beforeAddValue != max) {
            answer += 1;
            beforeAddValue += 1;
        }

        beforeAddValue = sides[0] + sides[1];

        while (max != beforeAddValue) {
            answer += 1;
            max += 1;
        }

        return answer;
    }
}
