class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[]res=new int[nums.length-k+1];
        //store the next greater element for each el
        Stack<Integer>st=new Stack<>();
        int[]nge=new int[nums.length];
        nge[nums.length-1]=nums.length;
        st.push(nums.length-1);

        for(int i=nums.length-2;i>=0;i--)
        {
            while(!st.isEmpty() && nums[i]>=nums[st.peek()])//chota logko hatate raho
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                nge[i]=nums.length;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(i);
        }

        //now run loop and see
        int ind=0;
        for(int i=0;i<=nums.length-k;++i)
        {
            // int j=i;//to jump to nge
        int j=i;
            while(nge[j]<i+k)
            {
                j=nge[j];
            }
        
            res[ind++]=nums[j];
        }

return res;
        }
        
}

        // int[] nge = new int[arr.length];
        // Stack<Integer> st = new Stack<>();
        // st.push(arr.length - 1);
        // nge[arr.length - 1] = arr.length;
        // for (int i = arr.length - 2; i >= 0; i--) {
        //     while (!st.isEmpty() && arr[i] >= arr[st.peek()]) 
        //         st.pop();
        //     if (st.isEmpty()) nge[i] = arr.length; 
        //     else nge[i] = st.peek();
        //     st.push(i);
        // }

        // int[] ans = new int[arr.length - k + 1];
        //  // To travel in nge
        // for (int i = 0; i <= arr.length - k; ++i) {
        //     int j = i;
        //     while (nge[j] < i + k) j = nge[j];
        //     ans[i] = arr[j];
        // }
        
        // return ans;
        
//     }
// }