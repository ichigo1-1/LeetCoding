class Solution {
    private int[] counts;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        counts = new int[n];
        int[] indexes = new int[n];
        
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }

        mergeSort(nums, indexes, 0, n - 1);

        List<Integer> result = new ArrayList<>();
        for (int count : counts) {
            result.add(count);
        }
        return result;
    }

    private void mergeSort(int[] nums, int[] indexes, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(nums, indexes, left, mid);
        mergeSort(nums, indexes, mid + 1, right);
        merge(nums, indexes, left, mid, right);
    }

    private void merge(int[] nums, int[] indexes, int left, int mid, int right) {
        int[] tempIndexes = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        int rightCount = 0;

        while (i <= mid && j <= right) {
            if (nums[indexes[j]] < nums[indexes[i]]) {
                tempIndexes[k++] = indexes[j++];
                rightCount++;
            } else {
                counts[indexes[i]] += rightCount;
                tempIndexes[k++] = indexes[i++];
            }
        }

        while (i <= mid) {
            counts[indexes[i]] += rightCount;
            tempIndexes[k++] = indexes[i++];
        }

        while (j <= right) {
            tempIndexes[k++] = indexes[j++];
        }

        for (int p = 0; p < tempIndexes.length; p++) {
            indexes[left + p] = tempIndexes[p];
        }
    }
}