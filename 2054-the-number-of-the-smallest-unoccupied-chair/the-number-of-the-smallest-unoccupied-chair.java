class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        //storing end time
        // int n=times.length;
        // int[]endtime=new int[n];
        // Arrays.fill(endtime,-1);
        // //storing
        // int target_arrival=times[targetFriend][0];//storing so that after sort itll be lost
        // //sorting
        // Arrays.sort(times,(a,b)->a[0]-b[0]);
        // for(int[]time:times)
        // {
        //     int arrival=time[0];
        //     int depart=time[1];
        //     //start from 1st chair
        //     for(int i=0;i<n;i++)
        //     {
        //         if(endtime[i]<=arrival)
        //         {
        //             //it means chair will be free
        //             endtime[i]=depart;//update with depart

        //             //check if this is the target
        //             if(arrival==target_arrival)
        //             {
        //                 return i;
        //             }
        //             break;//no need to go further
        //         }
        //     }
        // }
        // return -1;

        int n=times.length;
        PriorityQueue<int[]>occupied=new PriorityQueue<>((a,b)->a[0]-b[0]);//sort in ascending order of dept time   int[]={deptime,chair_occupied};
        PriorityQueue<Integer>free=new PriorityQueue<>();//by default it is a min heap only
        //storing target_arrival as it target will be lost once sorted
        int target_arrival=times[targetFriend][0];

        //sort
        Arrays.sort(times,(a,b)->a[0]-b[0]);//sorting on arrival time
        int chair_no=0;//keeps track if no free found
        
        for(int i=0;i<n;i++)
        {
            int arrival=times[i][0];
            int depart=times[i][1];

            //check until a shorter departure than currrent arrival is not found if not found assign chair_no directly
            //keep putting in free from there weve to pick the smallest chair
            while(!occupied.isEmpty() && occupied.peek()[0]<=arrival)
            {
                free.offer(occupied.poll()[1]);//these chairs are free//youve to choose the smallest ones

            }
            if(free.isEmpty())
            {
                occupied.offer(new int[]{depart,chair_no});

                if(arrival==target_arrival)
                {
                    return chair_no;
                }

                chair_no++;
            }
            else{
                int least=free.poll();
                if(arrival==target_arrival)
                {
                    return least;
                }
                occupied.offer(new int[]{depart,least});

            }
        }
        return -1;

    }
}