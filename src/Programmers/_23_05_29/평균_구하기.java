package Programmers._23_05_29;

class Solution_평균_구하기 {
    public double solution(int[] arr) {
        double answer = 0;
        for(double val: arr) {
            answer += val;
        }
        return answer / arr.length;
    }
}
