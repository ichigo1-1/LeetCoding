class Solution {
    public int maximum69Number (int num) {
        int c=0;
        int placevalue=-1;
        int number=num;
        while(num>0)
        {
            
            int rem=num%10;
            if(rem==6)
            {
                placevalue=c;
            }
            c++;
            num/=10;
        }
        if(placevalue==-1)
        {
            return number;
        }
        //now we just multiply 3 * 10^placevalue;
        int powered=(int)Math.pow(10,placevalue);
        return number+3*powered;
    }
}