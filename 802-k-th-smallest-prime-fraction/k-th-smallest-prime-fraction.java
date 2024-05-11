class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        List<int[]> fractions = new ArrayList<>();

        // Generate all possible fractions
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                fractions.add(new int[]{arr[i], arr[j]});
            }
        }

        // Sort the fractions based on their values
        Collections.sort(fractions, (a, b) -> Integer.compare(a[0] * b[1], a[1] * b[0]));

        // Return the kth smallest fraction
        return fractions.get(k - 1);
    }
}