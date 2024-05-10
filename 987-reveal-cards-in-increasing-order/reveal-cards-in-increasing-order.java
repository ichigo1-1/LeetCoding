class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {

        int[]res=new int[deck.length];
        Arrays.fill(res,0);
        boolean skip=false;
        int i=0;
        int j=0;
        int n=deck.length;
        //MOST IMPORTANTLY
        Arrays.sort(deck);
        while(i<n)
        {
            if(res[j]==0)//it means you can put an element there only if skip is false;
            {
                if(skip==false)
                {
                    res[j]=deck[i];
                    i++;
                }
                skip=!skip;
                //make the skip aternate
                //if true false and vice versa
            }
            //keep the j pouinter moving circulary
            j=(j+1)%n;
        }
        return res;
        
    }
}