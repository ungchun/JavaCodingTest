package Programmers._23_05_11;

class Solution_특정한_문자를_대문자로_바꾸기 {
    public String solution(String my_string, String alp) {
        String answer = "";

        char[] arr = my_string.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (String.valueOf(arr[i]).equals(alp)) {
                answer += String.valueOf(arr[i]).toUpperCase();
            }  else {
                answer += String.valueOf(arr[i]);
            }
        }

        return answer;
    }
}