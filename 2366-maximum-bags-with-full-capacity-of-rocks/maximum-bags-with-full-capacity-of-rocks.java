class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        //well create a difference array which will store the diff between total capacity - rocks present
        //well sort it to maximize the result ,well fill those first whose requirement is low
        int[]diff=new int[capacity.length];
        for(int i=0;i<capacity.length;i++)
        {
            diff[i]=capacity[i]-rocks[i];
        } 
        //sort it
        Arrays.sort(diff);
        //now iterate
        int score=0;
        
        for(int i=0;i<capacity.length && additionalRocks>0;i++)
        {
            if(diff[i]<=additionalRocks)
            {
                score++;
                additionalRocks-=diff[i];
            }
        }
        return score;
    }
}