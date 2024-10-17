class Solution {
    public int maximumSwap(int num) {
        //check if right i+1 are greater then swap
        String s=Integer.toString(num);
        int n=s.length();
        //create a array which stores the max element on right for easy access
        int[]maxright=new int[n];
        
        maxright[n-1]=n-1;
        for(int i=n-2;i>=0;i--)
        {
            int index=maxright[i+1];
            int el=s.charAt(index);

            if(s.charAt(i)>el)
            {
                maxright[i]=i;
            }else{
                maxright[i]=index;
            }
        }
        //find the first pos
        for(int i=0;i<n;i++)
        {
            int maxRightIdx = maxright[i];
            char maxRightElement = s.charAt(maxRightIdx);
            if(s.charAt(i)<maxRightElement)
            {
                //swap
                char[] charArray = s.toCharArray();
                char temp = charArray[i];
                charArray[i] = charArray[maxRightIdx];
                charArray[maxRightIdx] = temp;
                return Integer.parseInt(new String(charArray));
            }
        }
        return num;

    }
}