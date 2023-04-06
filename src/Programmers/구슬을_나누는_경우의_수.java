package Programmers;

import java.math.BigInteger;

class Solution_구슬을_나누는_경우의_수 {
    public BigInteger solution(int balls, int share) {
        BigInteger[] fac = new BigInteger[31];
        fac[0] = new BigInteger("1");
        fac[1] = new BigInteger("1");

        for (int i = 2; i <= 30; i++) {
            fac[i] = fac[i - 1].multiply(new BigInteger(Integer.toString(i)));
        }

        return (fac[balls].divide(fac[balls - share].multiply(fac[share])));
    }
}
