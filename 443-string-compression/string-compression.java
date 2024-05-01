class Solution {
    public int compress(char[] chars) {

        //algo
        //index and count leke chalo
        //as soon as a non duplicate is found
        //replace index with current char
        //do index ++ and there assign count

        int n=chars.length;
        int index=0;
        
        int i=0;

        while(i<n)
        {
            char current=chars[i];
            int count=0;

            //find the count for current char
            while(i<n && current==chars[i])
            {
                count++;
                i++;
            }
            //now do the assign task
            chars[index]=current;
            index++;
            //do the assigning only if count is greqater than 1 
            //ex if {a,b} O/P:-2 NOT A1B1
            if(count>1)
            {
                //convert count to string
                String s=Integer.toString(count);
                for(char ch:s.toCharArray())
                {
                    chars[index]=ch;
                    index++;
                }
            }

        }
        return index;


    }
}