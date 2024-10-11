class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        //storing end time
        int n=times.length;
        int[]endtime=new int[n];
        Arrays.fill(endtime,-1);
        //storing
        int target_arrival=times[targetFriend][0];//storing so that after sort itll be lost
        //sorting
        Arrays.sort(times,(a,b)->a[0]-b[0]);
        for(int[]time:times)
        {
            int arrival=time[0];
            int depart=time[1];
            //start from 1st chair
            for(int i=0;i<n;i++)
            {
                if(endtime[i]<=arrival)
                {
                    //it means chair will be free
                    endtime[i]=depart;//update with depart

                    //check if this is the target
                    if(arrival==target_arrival)
                    {
                        return i;
                    }
                    break;//no need to go further
                }
            }
        }
        return -1;

    }
}