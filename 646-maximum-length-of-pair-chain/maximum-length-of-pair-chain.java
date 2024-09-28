import java.util.Arrays;

class Solution {

    int n;
    int[][] t = new int[1001][1001];

    public int lis(int[][] nums, int prev_idx, int curr_idx) {
        if (curr_idx == n)
            return 0;

        if (prev_idx != -1 && t[prev_idx][curr_idx] != -1)
            return t[prev_idx][curr_idx];

        int taken = 0;
        if (prev_idx == -1 || nums[curr_idx][0] > nums[prev_idx][1])
            taken = 1 + lis(nums, curr_idx, curr_idx + 1);

        int not_taken = lis(nums, prev_idx, curr_idx + 1);

        if (prev_idx != -1)
            t[prev_idx][curr_idx] = Math.max(taken, not_taken);

        return Math.max(taken, not_taken);
    }

    public int findLongestChain(int[][] pairs) {
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        n = pairs.length;
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0])); // Sorting based on the first element.
        return lis(pairs, -1, 0);
    }
}
