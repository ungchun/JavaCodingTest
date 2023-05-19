package Programmers._23_05_19;

class Solution_글자_이어_붙여_문자열_만들기 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for (int i = 0; i < index_list.length; i++) {
            answer += my_string.charAt(index_list[i]);
        }
        return answer;
    }
}
