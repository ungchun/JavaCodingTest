package Programmers._23_06_19;

import java.util.*;
import java.io.*;

class Solution_ad_제거하기 {
    public String[] solution(String[] strArr) {
        List<String> arr = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                arr.add(strArr[i]);
            }
        }

        return arr.toArray(new String[arr.size()]);
    }
}