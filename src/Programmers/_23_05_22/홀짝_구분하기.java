package Programmers._23_05_22;

import java.util.Scanner;

class Solution_홀짝_구분하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? (n + " is even") : (n + " is odd"));
    }
}