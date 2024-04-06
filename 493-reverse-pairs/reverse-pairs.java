class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return 0; // base case: single element
        }

        int mid = low + (high - low) / 2;
        int count = mergeSort(arr, low, mid) + mergeSort(arr, mid + 1, high) + count(arr, low, mid, high);

        // Merge two sorted arrays
        int left = low, right = mid + 1;
        int[] temp = new int[high - low + 1];
        int index = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[index++] = arr[left++];
        }
        while (right <= high) {
            temp[index++] = arr[right++];
        }
        System.arraycopy(temp, 0, arr, low, temp.length); // Copy sorted elements back to original array

        return count;
    }

    private int count(int[] arr, int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2L * arr[right]) {
                right++;
            }
            count += right - (mid + 1);
        }

        return count;
    }
}
