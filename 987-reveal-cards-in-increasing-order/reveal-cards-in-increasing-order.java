class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {

        // int[]res=new int[deck.length];
        // Arrays.fill(res,0);
        // boolean skip=false;
        // int i=0;
        // int j=0;
        // int n=deck.length;
        // //MOST IMPORTANTLY
        // Arrays.sort(deck);
        // while(i<n)
        // {
        //     if(res[j]==0)//it means you can put an element there only if skip is false;
        //     {
        //         if(skip==false)
        //         {
        //             res[j]=deck[i];
        //             i++;
        //         }
        //         skip=!skip;
        //         //make the skip aternate
        //         //if true false and vice versa
        //     }
        //     //keep the j pouinter moving circulary
        //     j=(j+1)%n;
        // }
        // return res;


        //APPROACH 2 USING QUEUE
        //NO NEED OF SKIP VARR
        Arrays.sort(deck);
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<deck.length;i++)
        {
            q.add(i);//put indexes
        }
        int[]res=new int[deck.length];
 
        for (int i = 0; i < deck.length; i++) {
            int index = q.peek();
            q.remove();
            // put
            res[index] = deck[i];
            if (!q.isEmpty()) {
                q.add(q.peek());
                q.remove();
            }
        }
        return res;
        
    }
}



//  int n = deck.length;
//         int[] res = new int[n];

//         Arrays.sort(deck);
//         Queue<Integer> q = new LinkedList<>();

//         for(int i=0; i<n; i++) q.add(i);
        
//         int i = 0;
//         while(!q.isEmpty()){
//             res[q.poll()] = deck[i++];

//             if(!q.isEmpty()) q.add(q.poll());  
//         }

//         return res;