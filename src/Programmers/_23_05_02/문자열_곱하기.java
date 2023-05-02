package Programmers._23_05_02;

class Solution_문자열_곱하기 {
    public String solution(String my_string, int k) {
        String result = "";
        for (int i = 0; i < k; i++) {
            result += my_string;
        }
        return result;
    }
}