package Programmers._23_05_29;

class Solution_배열_만들기_1 {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int count = 0;

        for (int i = k; i <= n; i += k) {
            answer[count] = i;
            count++;
        }

        return answer;
    }
}