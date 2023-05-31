package Programmers._23_05_31;

class Solution_더_크게_합치기 {
    public int solution(int a, int b) {
        int answer = 0;
        String valA = String.valueOf(a);
        String valB = String.valueOf(b);

        String valAB = valA + valB;
        String valBA = valB + valA;

        return Integer.parseInt(valAB) > Integer.parseInt(valBA) ? Integer.parseInt(valAB) : Integer.parseInt(valBA);
    }
}
