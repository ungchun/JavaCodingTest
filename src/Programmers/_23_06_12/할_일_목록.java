package Programmers._23_06_12;

import java.util.*;

class Solution_할_일_목록 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> tempArr = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i] != true) {
                tempArr.add(todo_list[i]);
            }
        }

        return tempArr.toArray(new String[tempArr.size()]);
    }
}
