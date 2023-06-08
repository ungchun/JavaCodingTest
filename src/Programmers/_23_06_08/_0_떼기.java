package Programmers._23_06_08;

class Solution_0_떼기 {
    public String solution(String n_str) {
        return n_str.replaceFirst("^0+(?!$)", "");
    }
}