package Programmers._23_05_31;

class Solution_홀수_vs_짝수 {
    public int solution(int[] num_list) {
        int oddAnswer = 0;
        int evenAnswer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if ((i + 1) % 2 == 0) {
                oddAnswer += num_list[i];
            } else {
                evenAnswer += num_list[i];
            }
        }

        return oddAnswer > evenAnswer ? oddAnswer : evenAnswer;
    }
}