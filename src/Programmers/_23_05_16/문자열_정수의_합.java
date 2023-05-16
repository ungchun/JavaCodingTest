package Programmers._23_05_16;

class Solution_문자열_정수의_합 {
    public int solution(String num_str) {
        int answer = 0;
        String[] Arr = num_str.split("");

        for (int i = 0; i < Arr.length; i++) {
            answer += Integer.parseInt(Arr[i]);
        }

        return answer;
    }
}