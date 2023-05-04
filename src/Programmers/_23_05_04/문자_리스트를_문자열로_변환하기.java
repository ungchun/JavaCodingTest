package Programmers._23_05_04;

class Solution_문자_리스트를_문자열로_변환하기 {
    public String solution(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}