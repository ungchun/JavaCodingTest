package Programmers._23_05_19;
import java.util.Scanner;

class Solution_문자열_붙여서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = a.replace(" ", "");
        System.out.print(result);
        String b = sc.next();
        String result2 = b.replace(" ", "");
        System.out.print(result2);
    }
}