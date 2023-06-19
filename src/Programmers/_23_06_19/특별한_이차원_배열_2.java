package Programmers._23_06_19;

class Solution_특별한_이차원_배열_2 {
    public int solution(int[][] arr) {
        Boolean chk = true;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    chk = false;
                }
            }
        }
        return chk ? 1 : 0;
    }
}
