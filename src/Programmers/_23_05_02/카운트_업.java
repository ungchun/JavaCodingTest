package Programmers._23_05_02;

class Solution_카운트_업 {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        int count = start;
        for (int i = 0; i < end - start + 1; i++) {
            answer[i] = count;
            count++;
        }
        return answer;
    }
}
