package Programmers._23_05_02;

class Solution_원소들_곱과_합 {
    public int solution(int[] num_list) {
        int a = 1;
        int b = 0;

        for (int i = 0; i < num_list.length; i++) {
            a *= num_list[i];
            b += num_list[i];
        }

        return a > (b*b) ? 0 : 1;
    }
}