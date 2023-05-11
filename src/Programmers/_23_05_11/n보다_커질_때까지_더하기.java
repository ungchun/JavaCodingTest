package Programmers._23_05_11;

class Solution_n보다_커질_때까지_더하기 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n) {
                break;
            }
        }
        return answer;
    }
}