class Solution {
    public boolean find132pattern(int[] nums) {
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         // Check if nums[i] is less than nums[j]
        //         if (nums[i] < nums[j]) {
        //             for (int k = j + 1; k < nums.length; k++) {
        //                 // Check if nums[k] is between nums[i] and nums[j]
        //                 if (nums[k] < nums[j] && nums[k] > nums[i]) {
        //                     return true;
        //                 }
        //             }
        //         }
        //     }
        // }
        // return false;

        //***********BETTER APPROACH */
        //WELL OMIT THE FIRST LOOP AS WE JUST NEED TO GET THE MIN ELEMENT WHICH WE CAN DO INSIDE THE J LOOP
        // int min=nums[0];
        // for(int j=0;j<nums.length-1;j++)
        // {
        //     min=Math.min(min,nums[j]);
        //     for(int k=j+1;k<nums.length;k++)
        //     {
        //          if (nums[k] < nums[j] && nums[k] > min) {
        //                return true;
        //           }
        //     }
        // }
        // return false;


        ///OPTIMAL APPROACH
        //CODE STORY WITHMIK BEST
        //using stack to assign second max to num 3
        Stack<Integer> st = new Stack<>();
        int num_3 = Integer.MIN_VALUE;

        // Traversing from backwards to maintain the index order i < j < k
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < num_3) {
                return true;
            }
            while (!st.isEmpty() && st.peek() < nums[i]) {
                num_3 = st.pop();
            }
            st.push(nums[i]);
        }
        return false;


    }
}
