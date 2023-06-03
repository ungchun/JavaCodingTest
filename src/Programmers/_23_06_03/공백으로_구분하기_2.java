package Programmers._23_06_03;

import java.util.*;

class Solution_공백으로_구분하기_2 {
    public String[] solution(String my_string) {
        List<String> tempAns = new ArrayList<>();
        String[] answer = {};
        String temp = "";
        for (String val : my_string.split("")) {
            if (val.equals(" ")) {
                if (!temp.equals("")) {
                    tempAns.add(temp);
                }
                temp = "";
            } else {
                temp += val;
            }
        }
        if (!temp.equals("")) {
            tempAns.add(temp);
        }
        System.out.println(tempAns);
        return tempAns.toArray(new String[0]);
    }
}
