package Programmers._23_05_31;

class Solution_A_강조하기 {
    public String solution(String myString) {
        String answer = "";
        String[] val = myString.split("");

        for (int i = 0; i < val.length; i++) {
            if (val[i].equals("a")) {
                answer += "A";
            } else if (!val[i].equals("A")) {
                answer += val[i].toLowerCase();
            } else {
                answer += val[i];
            }
        }

        return answer;
    }
}
