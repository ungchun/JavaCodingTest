package Programmers._23_05_22;

class Solution_n개_간격의_원소들 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length-1)/n+1];
        int flag = 0;
        for (int i = 0; i < (num_list.length-1)/n+1; i++) {
            answer[i] = num_list[flag];
            flag += n;
        }

        return answer;
    }
}
