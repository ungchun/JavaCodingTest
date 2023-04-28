package Programmers._23_04_10;

class Solution_캐릭터의_좌표 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int count = 0;
        answer[0] = 0;
        answer[1] = 0;

        int rowValue = Integer.valueOf(Math.abs(board[0])) / 2;
        int columValue = Integer.valueOf(Math.abs(board[1])) / 2;

        while (count != keyinput.length) {
            switch (keyinput[count]) {
                case "left":
                    if (Math.abs(answer[0]) < rowValue || answer[0] > 0) {
                        answer[0] -= 1;
                    }
                    break;
                case "right":
                    if (Math.abs(answer[0]) < rowValue || answer[0] < 0) {
                        answer[0] += 1;
                    }
                    break;
                case "up":
                    if (Math.abs(answer[1]) < columValue || answer[1] < 0) {
                        answer[1] += 1;
                    }
                    break;
                case "down":
                    if (Math.abs(answer[1]) < columValue || answer[1] > 0) {
                        answer[1] -= 1;
                    }
                    break;
                default:
                    break;
            }
            count++;
        }
        return answer;
    }
}