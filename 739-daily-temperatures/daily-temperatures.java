class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] res = new int[n];
        
        // Iterate from the last day to the first day
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack while the current temperature is greater or equal
            // to the temperature at the index stored at the top of the stack
            while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                st.pop();
            }
            
            // If the stack is not empty, the next warmer day is at the index on the top of the stack
            if (!st.isEmpty()) {
                res[i] = st.peek() - i;
            } else {
                res[i] = 0; // No warmer day in the future
            }
            
            // Push the current day index onto the stack
            st.push(i);
        }
        
        return res;
    }
}