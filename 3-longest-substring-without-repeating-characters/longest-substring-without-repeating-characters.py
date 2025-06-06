class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        count = [0] * 128  
        left = 0
        max_length = 0

        for right in range(len(s)):
            count[ord(s[right])] += 1

            while count[ord(s[right])] > 1:
                count[ord(s[left])] -= 1
                left += 1

            max_length = max(max_length, right - left + 1)

        return max_length
