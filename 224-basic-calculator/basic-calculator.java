class Solution {
    public int calculate(String s) {

        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int num = 0;
        int sign = 1; // 1 for positive, -1 for negative

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; // Adjust the index
                result += sign * num;
                num = 0;
            } else if (ch == '+') {
                sign = 1;
            } else if (ch == '-') {
                sign = -1;
            } else if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (ch == ')') {
                result *= stack.pop(); // sign
                result += stack.pop(); // previous result
            }
        }

        return result;
    }
        
    }
