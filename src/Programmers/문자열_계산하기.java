package Programmers;

class Solution_문자열_계산하기 {
    public int solution(String my_string) {
        int answer = 0;

        String[] Arr = my_string.split(" ");

        String before = "";
        answer = Integer.parseInt(Arr[0]);

        for(int i = 1; i < Arr.length; i++) {

            switch (Arr[i]) {
                case "+" -> {
                    before = "+";
                }
                case "-" -> {
                    before = "-";
                }
                default -> {
                    switch (before) {
                        case "+" -> {
                            answer += Integer.parseInt(Arr[i]);
                        }
                        case "-" -> {
                            answer -= Integer.parseInt(Arr[i]);
                        }
                        default -> {

                        }
                    }
                }
            }
        }
        return answer;
    }
}
