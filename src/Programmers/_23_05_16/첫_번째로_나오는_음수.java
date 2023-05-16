package Programmers._23_05_16;

class Solution_첫_번째로_나오는_음수 {
    public int solution(int[] num_list) {
        int answer = 0;
        boolean check = false;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                check = true;
                break;
            }
            answer += 1;
        }

        return check ? answer : -1;
    }
}
