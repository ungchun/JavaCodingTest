package Programmers._23_05_22;

class Solution_문자열_바꿔서_찾기 {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";

        for (int i = 0; i < myString.length(); i++) {
            if ("A".equals(myString.substring(i, i + 1))) {
                str += "B";
            } else {
                str += "A";
            }
        }

        if (str.contains(pat)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
