class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int left[] =  new int[n];
        int right[] =  new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<n;i++)
        {
            while(s.isEmpty()==false && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                left[i]=-1;
            }
            else
            {
                left[i]=s.peek();
            }

            //ADD THE INDEX ONTO THE STACK
            s.push(i);
        }

        // Do the same for right
        s= new Stack<>();
        
        for(int i=heights.length-1;i>=0;i--)
        {
            while(s.isEmpty()==false && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                right[i]=n;
            }
            else
            {
                right[i]=s.peek();
            }
            s.push(i);

        }
        int result=0;
        for(int i=0;i<n;i++)
        {
            int current = (right[i]-left[i]-1) * heights[i];
            result=Math.max(result,current);
        }
        return result;
        
    }
}