package Programmers._23_04_04;
class Solution_컨트롤_제트 {
    public int solution(String s) {
        int answer = 0;
        int beforeValue = 0;
        String[] Arrays = s.split(" ");

        for(int i = 0; i < Arrays.length; i++) {
            if (Arrays[i].equals("Z")) {
                answer -= beforeValue;
            } else {
                answer += Integer.parseInt(Arrays[i]);
                beforeValue = Integer.parseInt(Arrays[i]);
            }
        }

        return answer;
    }
}