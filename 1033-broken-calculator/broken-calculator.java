class Solution {
    public int brokenCalc(int startValue, int target) {
        //well apply reverse engineering here
        //instead of going from start->target
        //we ll go target->start by changing the operators + and /
        //well take advantage of / whenever the numbers even well divide by 2
        //if odd add 1 to make it divide by 2
        //also if at any point target<start just +1 by the difference
        if(startValue==target)
        {
            return 0;
        }
        if(startValue>target)
        {
            return startValue-target;
        }

        if(target%2==0)
        {
            return 1 + brokenCalc(startValue,target/2);
        }
        return 1 + brokenCalc(startValue,target+1);


    }
}