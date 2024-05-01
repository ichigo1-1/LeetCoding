class Solution {
    public String countAndSay(int n) {

        //algo
        //we know for n==1  res will be "1";
        //now we need to process
        
        //base case
        if(n==1)
        {
            return "1";
        }
        //call the rec function
        String say = countAndSay(n-1);

        //processing
        String res="";
        
        for(int i=0;i<say.length();i++)
        {
            char ch=say.charAt(i);
            int count=1;

            //count the freq
            while(i<say.length()-1 && ch==say.charAt(i+1))
            {
                count++;
                i++;
            }
            res+=Integer.toString(count)+ch+"";
        }
        return res;
        
    }
}