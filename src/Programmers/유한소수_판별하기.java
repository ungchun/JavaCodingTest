package Programmers;
class Solution_유한소수_판별하기 {
    public int solution(int a, int b) {
        int min = (a < b) ? a : b;
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }

        a /= gcd;
        b /= gcd;

        while (b % 2 == 0 || b % 5 == 0) {
            if (b % 5 == 0) {
                b /= 5;
            } else if (b % 2 == 0) {
                b /= 2;
            }
        }

        if (b == 1) {
            return 1;
        } else {
            return 2;
        }
    }
}
