package Programmers._23_05_30;

class Solution_접두사인지_확인하기 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String check = "";

        String[] val = my_string.split("");

        for (int i = 0; i < val.length; i++) {
            check += val[i];
            if (check.equals(is_prefix)) {
                answer = 1;
            }
        }

        return answer;
    }
}
