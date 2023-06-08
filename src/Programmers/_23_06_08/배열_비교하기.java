package Programmers._23_06_08;
import java.util.*;
class Solution_배열_비교하기 {
    public int solution(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        } else {
            return Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum() ? 1 : Arrays.stream(arr1).sum() == Arrays.stream(arr2).sum() ? 0 : -1;
        }
    }
}
