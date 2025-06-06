class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128]; // ASCII size
        int left = 0, right = 0, maxLength = 0;

        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}
