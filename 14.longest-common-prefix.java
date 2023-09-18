/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Check if the input array is empty, if so, return an empty string
        if (strs.length == 0) return "";

        // Initialize a variable to store the minimum length of strings in the array
        int minLen = strs[0].length();

        // Find the minimum length among all strings in the array
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        // Iterate through the characters at the same position in all strings
        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            
            // Compare the character at the current position in each string
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    // If characters don't match, return the common prefix found so far
                    return strs[0].substring(0, i);
                }
            }
        }

        // If no mismatch is found, return the common prefix found in all strings
        return strs[0].substring(0, minLen);
    
    }
}
// @lc code=end

