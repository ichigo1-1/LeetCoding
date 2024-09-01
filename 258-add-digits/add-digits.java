class Solution {
    public int len(int n) {
        String s = String.valueOf(n);
        return s.length();
    }

    public int addDigits(int num) {
        int sum = num;
        while (len(sum) > 1) {  // Check if the number has more than one digit
            sum = 0;
            while (num > 0) {   // Calculate the sum of digits of num
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
            num = sum;          // Update num to the new sum to continue the process
        }
        return sum;
    }
}