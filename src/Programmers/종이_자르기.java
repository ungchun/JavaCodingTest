package Programmers;

class Solution_종이_자르기 {
    public int solution(int M, int N) {
        int answer = 0;
        if (M == 1) {
            return N - 1;
        } else {
            return answer += M * N - 1;
        }
    }
}
