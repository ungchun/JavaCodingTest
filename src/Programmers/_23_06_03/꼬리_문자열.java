package Programmers._23_06_03;

class Solution_꼬리_문자열 {
    public String solution(String[] str_list, String ex) {
        String answer = "";

        for (String val: str_list ) {
            if (!val.contains(ex)) {
                answer += val;
            }
        }

        return answer;
    }
}