class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[]ans=new int[nums.length];
        Stack<Integer>st=new Stack<>();
        for(int i=nums.length-2;i>=0;i--)
        {
            while(st.size()>0 && nums[i]>=st.peek())
            {
                st.pop();
            }
            st.push(nums[i]);
        }
        //main logic
         for(int i=nums.length-1;i>=0;i--)
        {
            int num=nums[i];
            while(st.size()>0 && num>=st.peek())
            {
                st.pop();
            }
            if(st.size()==0)
            {
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(num);
        }
        return ans;
        
    }
}