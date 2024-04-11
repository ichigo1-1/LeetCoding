class Solution {
    public int minMovesToMakePalindrome(String s) {
        /// JUST A NORMAL APPROACH BUT THIS DOES NOT WORK
        // HashMap<Character, Integer> frequencyMap = new HashMap<>();
        // int swapsNeeded = 0;
 
        // char[] strArray = s.toCharArray();
        // for (char c : strArray) {
        //     frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        // }
       
        // for (int val : frequencyMap.values()) {
        //     swapsNeeded += val / 2; // Calculate swaps needed for each character
        // }
 
        // return swapsNeeded;
        int len=s.length();
        char[] arr = s.toCharArray();        
		int steps = 0;
		int l = 0, r = len-1;// use two pointers l for left and r for right.
        
        while(l<r)
        {
            if(arr[l]==arr[r])
            {
                l++;
                r--;
            }
            else{
                int k=r;
                k = findKthIndexMatchingwithLthIndex(arr, l, k);  
                if(k==l)
                {
                    swap(arr,l);
                    steps++;
                }
                else{
                    while(k<r)
                    {
                        swap(arr,k);
                        steps++;
                        k++;
                    }
                    l++;
                    r--;
                }



            }

        }
        return steps;


    }
    public int findKthIndexMatchingwithLthIndex(char[] strArr, int l, int k){
		while(k > l){
			if(strArr[k] == strArr[l]){  return k;  }                    
			k--;
		}
		return k;
	}

	public void swap(char[] strArr, int l){
		if(l+1 < strArr.length){
			char tempCh = strArr[l];
			strArr[l] = strArr[l+1];
			strArr[l+1] = tempCh;
		}
	}
}