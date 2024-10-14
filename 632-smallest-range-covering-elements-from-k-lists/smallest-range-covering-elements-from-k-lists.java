class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int k=nums.size();
        int[] vec=new int[k];
        int[] resultrange={-1000000,1000000};
        while(true)
        {
            int minIdx=0;//starting off with 0
            int maxValue=Integer.MIN_VALUE;
            int minValue=Integer.MAX_VALUE;

            for(int i=0;i<k;i++)
            {
                int listindex=i;//gives the list
                int elemindex=vec[i];//gives the index of list in vec as were storing indexes not element
                int element=nums.get(listindex).get(elemindex);
                if(element<minValue)
                {
                    minValue=element;
                    minIdx=i;
                }
                //also update max
                maxValue=Math.max(maxValue,element);
            }
            //now check if cur range better or not???
            if(maxValue-minValue<resultrange[1]-resultrange[0])
            {
                resultrange[0]=minValue;
                resultrange[1]=maxValue;
            }
            //now move to the list which has smallest element
            int nextidx=vec[minIdx]+1;
            if(nextidx>=nums.get(minIdx).size())//agar out of range ho jata h toh break kardo
            {
                break;
            }
            vec[minIdx]=nextidx;
        }
        return resultrange;
    }
}