class Solution {
    public int maximalRectangle(char[][] matrix) {
     
        int[]heights = new int[matrix[0].length];
        
        int area=0;
        for(int i=0;i<matrix[0].length;i++)
        {
            heights[i]=matrix[0][i]-'0';
        }
        area=calculate(heights);

        for(int i=1;i<matrix.length;i++)//row change karnai
        {
            //for changing col value
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]=='1')
                {
                    heights[j]+=1;
                }
                else{
                    heights[j]=0;
                }
            }
            //pura row ka area nikaldo and find max comparing it with prev max
            area=Math.max(area,calculate(heights));
        }
        return area;
        
    }
    public int calculate(int[] heights) {
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


