class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i]==0)
            {
                //shuru ka value 
                //and checking the prev flower val is 0 then its 0 else 1
                int prev=(i==0 || flowerbed[i-1]==0)?0:1;
                 //end ka value  keliye right nahi dekhna so if end index then directly 0
                 
                //and checking the prev flower val is 0 then its 0 else 1
                int next=(i==flowerbed.length-1 || flowerbed[i+1]==0)?0:1;
                if(prev==0 && next ==0)
                {
                    flowerbed[i]=1;
                    count++;
                    
                }
            }
        }
        return count>=n?true:false;
        
    }
}