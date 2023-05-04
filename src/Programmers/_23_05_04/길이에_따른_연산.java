package Programmers._23_05_04;

class Solution_길이에_따른_연산 {
    public int solution(int[] num_list) {
        int a = 0;
        int b = 1;
        for(int value: num_list) {
            b *= value;
            a += value;

        }
        return num_list.length >= 11 ? a : b;
    }
}
