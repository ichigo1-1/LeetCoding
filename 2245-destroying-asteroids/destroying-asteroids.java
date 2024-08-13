class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        //GREEDY
        //SORT THEN COLLIDE
        Arrays.sort(asteroids);
        long initial=mass;//using long as constraints are high
        for(int it:asteroids)
        {
            if(it>initial)
            {
                return false;
            }
            initial+=it;
        }
        return true;
    }
}