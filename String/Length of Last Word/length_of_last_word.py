#https://leetcode.com/problems/length-of-last-word/


'''
58. Length of Last Word  

Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Example 2:

Input: s = " "
Output: 0


Constraints:
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
'''


class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        temp = s.split()
        if len(temp) == 0:
            return 0
        else :
            return len(temp[-1])
        