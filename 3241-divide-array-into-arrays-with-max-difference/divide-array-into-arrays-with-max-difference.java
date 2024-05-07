class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int len=nums.length;
        int row=len/3;
        int[][]arr=new int[row][3];
        int index=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=3)
        {
            if(nums[i+2]-nums[i]>k)
            {
                return new int[][]{};
            }
            else{
                //push into array
                arr[index][0]=nums[i];
                arr[index][1]=nums[i+1];
                arr[index][2]=nums[i+2];
                index++;
            }
        }
        return arr;
        
    }
}