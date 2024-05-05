class Solution {
    public int numberOfSubstrings(String s) {
        //  int count=0;
        // int[]arr=new int[3];
        // for(int i=0;i<s.length();i++)
        // {
        //     Arrays.fill(arr,0);
        //     for(int j=i;j<s.length();j++)
        //     {
        //         arr[s.charAt(j)-'a']=1;
        //         if(arr[0]+arr[1]+arr[2]==3)
        //         {
        //             // count++;
        //             count=count+s.length()-j;
        //             break;
        //         }
        //     }
        // }
        // return count;

         int count = 0;
        int[] position = new int[3];
        Arrays.fill(position, -1);
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            position[ch - 'a'] = i;
            if(position[0] != -1 && position[1] != -1 && position[2] != -1)
            {
                int last = findLast(position);
                count = count + (1 + last);
            }
        }
        return count;
    }
    public int findLast(int[] a)
    {
        int last = Integer.MAX_VALUE;
        for(int i = 0 ; i < a.length ; i++)
            last = Math.min(last , a[i]);
        return last;            
    }
        
    }
