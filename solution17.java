import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible
 * letter combinations that the number could represent. Return the answer in any
 * order.
 * 
 * A mapping of digits to letters (just like on the telephone buttons) is given
 * below. Note that 1 does not map to any letters.
 * 
 * Example 1:
 * 
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 */
public class solution17 {
    public ArrayList<String> letterCombinations(String digits) {

        ArrayList<String> result = new ArrayList<>();

        if (digits.length() == 0)
            return result;

        HashMap<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        // List of queue
        Queue<String> q = new LinkedList<>();
        // Insert an empty string to a queue still counts the size -> q.size() is 1 now
        q.add("");
        // _a_d_ -> _a_e_ ..... _looks doesn't exist
        for (int i = 0; i < digits.length(); i++) {
            // get the letter of the number : 2,abc
            String d = map.get(digits.substring(i, i + 1));
            for (int j = 0; j < q.size(); j++) {
                String first = q.poll();
                for (int k = 0; k < d.length(); k++) {
                    String temp = first.concat(d.charAt(k) + "");
                    q.add(temp);
                }
            }
        }
        /**
         * queue[_a_,_b_,_c_]
         * 
         * queue[_b_,_c_,_a_d_,_a_e_,_a_f_]
         * ......
         */
        while (!q.isEmpty()) {
            result.add(q.poll());
        }
        return result;
    }
}
