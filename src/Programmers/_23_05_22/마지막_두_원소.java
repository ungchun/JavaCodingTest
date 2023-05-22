package Programmers._23_05_22;

class Solution_마지막_두_원소 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        int val = 0;
        if (num_list[num_list.length-1] > num_list[num_list.length-2]) {
            val = num_list[num_list.length-1] - num_list[num_list.length - 2];
            answer[answer.length-1] = val;
        } else {
            answer[answer.length-1] = num_list[num_list.length-1] * 2;
        }
        return answer;
    }
}
