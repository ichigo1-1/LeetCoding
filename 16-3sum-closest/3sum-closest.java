class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int ans = Integer.MAX_VALUE;
int closestSum = Integer.MAX_VALUE; // Track the sum closest to the target
int n = arr.length;

for (int i = 0; i < n - 2; i++) {
    for (int j = i + 1; j < n - 1; j++) {
        for (int k = j + 1; k < n; k++) {
            int cur = arr[i] + arr[j] + arr[k];
            int diff = Math.abs(cur - target); // Calculate the absolute difference

            if (diff < Math.abs(ans - target)) {
                ans = cur; // Update ans if the current sum is closer to the target
                closestSum = cur;
            }
        }
    }
}

return closestSum;

    }
}