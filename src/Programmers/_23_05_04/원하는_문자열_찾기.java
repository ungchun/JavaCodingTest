package Programmers._23_05_04;

class Solution_원하는_문자열_찾기 {
    public int solution(String myString, String pat) {
        String a = myString.toUpperCase();
        String b = pat.toUpperCase();

        return a.contains(b) ? 1 : 0;
    }
}
