package Programmers._23_04_05;

class Solution_잘라서_배열로_저장하기 {
    public String[] solution(String my_str, int n) {

        int cnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[cnt];

        String tempString = "";
        int tempCount = 0;
        int arrayCount = 0;

        for(int i = 0; i < my_str.length(); i++) {
            tempString += my_str.charAt(i);
            tempCount += 1;
            if (tempCount == n) {
                answer[arrayCount] = tempString;
                tempString = "";
                tempCount = 0;
                arrayCount += 1;
            }
        }

        if (!tempString.isEmpty()) {
            answer[arrayCount] = tempString;
        }
        return answer;
    }
}
