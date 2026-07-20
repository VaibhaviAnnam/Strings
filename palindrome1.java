// To find the length of the longest substring without repeating characters in a given string

public class palindrome1 {
    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);

                if (!hasDuplicate(sub)) {
                    if (sub.length() > longest) {
                        longest = sub.length();
                    }
                }
            }
        }

        return longest;
    }

    public static boolean hasDuplicate(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String args[]){
        String str="vaibhavi";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(str));
        //Solution solution = new Solution();
        //System.out.println(solution.lengthOfLongestSubstring(str));
    }
}