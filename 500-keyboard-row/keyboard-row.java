import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String w : words) {
            int[] rowCount = new int[3];
            for (char ch : w.toLowerCase().toCharArray()) {
                if (s1.indexOf(ch) != -1) rowCount[0]++;
                else if (s2.indexOf(ch) != -1) rowCount[1]++;
                else if (s3.indexOf(ch) != -1) rowCount[2]++;
            }

            int usedRows = 0;
            for (int count : rowCount) {
                if (count > 0) usedRows++;
            }

            if (usedRows == 1) { // word uses only one row
                result.add(w);
            }
        }

        return result.toArray(new String[0]);
    }
}
