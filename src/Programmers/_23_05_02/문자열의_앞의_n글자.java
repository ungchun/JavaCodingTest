package Programmers._23_05_02;

class Solution_문자열의_앞의_n글자 {
    public String solution(String my_string, int n) {
        String answer = "";

        String[] Arr = my_string.split("");

        for (int i = 0; i < n; i++) {
            answer += Arr[i];
        }
        return answer;
    }
}
