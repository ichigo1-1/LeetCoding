class Solution {
    public int[] avoidFlood(int[] rains) {
        int[]ans=new int[rains.length];
        HashMap<Integer,Integer>lastrain=new HashMap<>();
        TreeSet<Integer>dry=new TreeSet<>();//using this to get just one higher dry value as it stores in ascending
        for(int i=0;i<rains.length;i++)
        {
            int x=rains[i];
            if(x==0)
            {
                dry.add(i);//store its index
                ans[i]=1;
            }
            else {
                Integer id=lastrain.get(x);
                if(id==null)
                {
                    lastrain.put(x,i);
                }
                else{
                    Integer drythisday=dry.higher(id);
                    if(drythisday==null)
                    {
                        return new int[0];
                    }
                    ans[drythisday]=x;//im drying up this lake
                    dry.remove(drythisday);//remove as youve used it
                    //update the lastrain
                    lastrain.put(x,i);
                }
                ans[i]=-1;
            }
        }
        return ans;
    }
}