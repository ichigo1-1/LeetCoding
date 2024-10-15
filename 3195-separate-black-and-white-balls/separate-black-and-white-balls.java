class Solution {
    public long minimumSteps(String s) {
     //just get the count of black balls 1 and everytime you encounter a 0 you add that to the swaps needed
     long black=0;
     long swaps=0;
     for(char ch:s.toCharArray())
     {
        if(ch=='1')
        {
            black++;
        }
        else{
            swaps+=black;
        }
     }
     return swaps;   
    }
}