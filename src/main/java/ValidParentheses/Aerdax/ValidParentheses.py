class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        a=[]
        for i in s:
            if i == '(':
                a.append(i)
            if i == ')':
                if len(a) == 0 or a.pop() != '(':
                    return False
            if i == '{':
                a.append(i)
            if i =='}':
                if len(a) == 0 or a.pop() != '{':
                    return False
            if i == '[':
                a.append(i)
            if i == ']':
                if len(a) == 0 or a.pop() != '[':
                    return False
        if len(a) > 0:
            return False
        return True