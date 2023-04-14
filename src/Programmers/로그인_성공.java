package Programmers;

class Solution_로그인_성공 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";

        for(int i = 0; i < db.length; i++) {
            if (db[i][0].equals(id_pw[0])) {
                answer = "wrong pw";
                if (db[i][1].equals(id_pw[1])) {
                    answer = "login";
                }
            }

            if (answer.equals("login")) {
                break;
            }
        }
        return answer;
    }
}
