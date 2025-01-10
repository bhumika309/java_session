Example 1:

Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
["hero","as"] is also a valid answer.
Example 2:

Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".
Example 3:

Input: words = ["blue","green","bu"]
Output: []
Explanation: No string of words is substring of another string.

  class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>(); 

        for (int i = 0; i < words.length; i++) {
            String sOne = words[i];
            for (int j = 0; j < words.length; j++) {
                String sTwo = words[j];
               
                if (i != j && sOne.length() <= sTwo.length() && subString(sOne, sTwo)) {
                    result.add(sOne);
                    break; 
                }
            }
        }
        return result; 
    }

    
    public boolean subString(String sOne, String sTwo) {
        for (int i = 0; i <= sTwo.length() - sOne.length(); i++) {
            if (sOne.equals(sTwo.substring(i, i + sOne.length()))) {
                return true;
            }
        }
        return false;
    }
}
