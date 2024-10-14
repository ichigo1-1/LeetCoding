class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int score=0;
        for(int i=0;i<costs.length && coins>0;i++)
        {
            if(costs[i]<=coins)
            {
                score++;
                coins-=costs[i];
            }
        }
        return score;
    }
}