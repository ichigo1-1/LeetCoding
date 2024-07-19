class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r)
        {
            int width=r-l;
            int heights=Math.min(height[l],height[r]);
            max=Math.max(max,heights*width);
            if(height[l]<height[r])
            {
                l++;
            }
            else{
                r--;
            }
        }
        return max;

        
    }
}