class Solution {
            public boolean checkValidString(String s) {
                int n1 = 0;
                int n2 = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '(' || s.charAt(i) == '*') n1++;
                    else n1--;
                    if (n1 < 0) return false;
                }

                if (n1 == 0) return true;
                else {
                    for (int i = s.length() - 1; i >= 0; i--) {
                        if (s.charAt(i) == ')' || s.charAt(i) == '*') n2++;
                        else n2--;
                        if (n2 < 0) return false;
                    }

                    if (n2 >= 0) return true;
                    else return false;
                }
            }
        }
