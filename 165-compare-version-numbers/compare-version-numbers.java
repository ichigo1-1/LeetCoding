class Solution {
    public int compareVersion(String version1, String version2) {
        String[]arr1=version1.split("\\.");
        String[]arr2=version2.split("\\.");

        //now compare
        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        while(i<n || i<m)
        {
            int a = i<n?Integer.parseInt(arr1[i]):0;
            int b=i<m?Integer.parseInt(arr2[i]):0;
            if(a>b)
            {
                return 1;
            }
            if(a<b)
            {
                return -1;
            }
            else{
                i++;
            }
        }
        return 0;
        
    }
}