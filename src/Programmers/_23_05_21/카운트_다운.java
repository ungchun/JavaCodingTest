package Programmers._23_05_21;

class Solution_카운트_다운 {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        int count = 0;

        for (int i = start; i >= end; i--) {
            answer[count] = i;
            count++;
        }

        return answer;
    }
}
