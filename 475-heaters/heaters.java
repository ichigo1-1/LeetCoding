class Pair
{
    int js=-1;
    int jl=-1;
    Pair(int s,int l)
    {
        js=s;
        jl=l;
    }
}
class Solution {
    public Pair binarysearch(int key,int[]heaters)
    {
        Pair p=new Pair(-1,-1);
        int low=0;
        int high=heaters.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(heaters[mid]==key)//heater is fitted to the house itself so in this case the smallest and largest are the same
            {
                p.js=heaters[mid];
                p.jl=heaters[mid];
                break;
            }
            else if(heaters[mid]<key)
            {
                p.js=heaters[mid];
                low=mid+1;
            }
            else{
                p.jl=heaters[mid];
                high=mid-1;
            }

        }
        return p;
    }
    public int findRadius(int[] houses, int[] heaters) {
        //Step 1:sort the heaters array to applyu binary search to get the just largest and just smallest element for the current house position
        Arrays.sort(heaters);
        int ans=0;

        //STEP 2:- TRAVERSE
        for(int i=0;i<houses.length;i++)
        {
            int hp=houses[i];
            Pair p=binarysearch(hp,heaters);
            int d1=(p.js==-1)?Integer.MAX_VALUE:hp-p.js;
            int d2=(p.jl==-1)?Integer.MAX_VALUE:p.jl-hp;
            int miniD=Math.min(d1,d2);
            if(miniD>ans)
            {
                ans=miniD;
            }
        }
        return ans;
    }
}