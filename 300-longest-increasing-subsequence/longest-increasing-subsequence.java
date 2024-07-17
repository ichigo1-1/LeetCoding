class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > res.get(res.size()-1)) {
                res.add(nums[i]);
            } else {
                int ind = lowerbound(res, nums[i]);
                res.set(ind, nums[i]);
            }
        }
        return res.size();
    }

    public int lowerbound(ArrayList<Integer> res, int target) {
        int low = 0;
        int high = res.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (res.get(mid) >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}