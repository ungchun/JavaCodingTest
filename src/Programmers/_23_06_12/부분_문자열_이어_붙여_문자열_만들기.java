package Programmers._23_06_12;

class Solution_부분_문자열_이어_붙여_문자열_만들기 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];

            answer += str.substring(parts[i][0], parts[i][1] + 1);
        }
        return answer;
    }
}