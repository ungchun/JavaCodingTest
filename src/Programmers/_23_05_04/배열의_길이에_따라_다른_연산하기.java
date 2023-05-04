package Programmers._23_05_04;

class Solution_배열의_길이에_따라_다른_연산하기 {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;

        if (arr.length % 2 == 0) {
            for (int i = 1; i < arr.length; i+=2) {
                answer[i] = answer[i] + n;
            }
        } else {
            for (int i = 0; i < arr.length; i+=2) {
                answer[i] = answer[i] + n;
            }
        }
        return answer;
    }
}
