package Programmers._23_06_12;

import java.util.*;
class Solution_5명씩 {
    public String[] solution(String[] names) {
        List<String> tempArr = new ArrayList<>();

        int count = 0;

        tempArr.add(names[0]);
        for (int i = 0; i < names.length; i++) {
            if (count == 5) {
                count = 0;
                tempArr.add(names[i]);
            }
            count++;
        }

        return tempArr.toArray(new String[tempArr.size()]);
    }
}