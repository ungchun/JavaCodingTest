package Programmers._23_05_02;

class Solution_flag에_따라_다른_값_반환하기 {
    public int solution(int a, int b, boolean flag) {
        return flag == true ? a+b : a-b;
    }
}