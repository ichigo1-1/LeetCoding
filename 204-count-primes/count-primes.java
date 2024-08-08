class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; // No prime numbers less than 2
        
        int[] arr = new int[n];

        // Initialize the array assuming all numbers >= 2 are prime
        for (int i = 2; i < n; i++) {
            arr[i] = 1;
        }

        // Apply the Sieve of Eratosthenes
        for (int i = 2; i * i < n; i++) {
            if (arr[i] == 1) {
                for (int j = i * i; j < n; j += i) {
                    arr[j] = 0; // Mark multiples of i as non-prime
                }
            }
        }

        // Count the number of primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }

        return count;
    }
}
