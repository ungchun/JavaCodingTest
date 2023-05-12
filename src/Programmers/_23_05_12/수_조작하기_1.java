package Programmers._23_05_12;

class Solution_수_조작하기_1 {
    public int solution(int n, String control) {
        char[] a = control.toCharArray();
        for (int i = 0; i < control.length(); i++) {
            switch (a[i]) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}