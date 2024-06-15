class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
      // BRUTE FORCE   TLE
        // HashSet<List<Integer>>set=new HashSet<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         for(int k=j+1;k<nums.length;k++)
        //         {
        //             if(nums[i]+nums[j]+nums[k]==0)
        //             {
        //                 List<Integer>temp= Arrays.asList(nums[i],nums[j],nums[k]);
        //                 Collections.sort(temp);
        //                 set.add(temp);
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>>ans=new ArrayList<>(set);
        // return ans;

        //BETTER  APPROACH
        // Set<List<Integer>>set=new HashSet<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     Set<Integer>hashset=new HashSet<>();
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         int third=-(nums[i]+nums[j]);///basic maths formula
        //         if(hashset.contains(third))
        //         {
        //             List<Integer>temp=Arrays.asList(nums[i],nums[j],third);
        //             Collections.sort(temp);
        //             set.add(temp);
        //         }
        //         hashset.add(nums[j]);
        //     }
        // }
        // List<List<Integer>>ans=new ArrayList<>(set);
        // return ans;


        //OPTIMAL SOLUTION
        //WELL SORT THE ARRAY AND DO THE 2 POUNTER APPROACH STRIVER
        // Arrays.sort(nums);
        // List<List<Integer>>ans=new ArrayList<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(i>0 && nums[i]==nums[i-1])
        //     {
        //         continue;
        //     }
        //     int j=i+1;
        //     int k=nums.length-1;
        //     while(j<k)
        //     {
        //         int sum=nums[i]+nums[j]+nums[k];
        //         if(sum<0)//SUM KAM ARAI TO BARHAO
        //         {
        //             j++;
        //         }
        //         else if(sum>0)//JADA ARAI TO GHATAO
        //         {
        //             k--;
        //         }
        //         else{
        //             List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k]);
        //             ans.add(temp);
        //             j++;
        //             k--;
        //             //now check if same or not
        //             //if same move until dif element//also check boundary j<k
        //             while(j<k && nums[j]==nums[j-1])
        //             {
        //                 j++;
        //             }
        //              while(j<k && nums[k]==nums[k+1])
        //             {
        //                 k--;
        //             }

        //         }
        //     }
            
        // }
        // return ans;

        // HashSet<List<Integer>>set=new HashSet<>();
        // for(int i=0;i<nums.length-2;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         for(int k=j+1;k<nums.length;k++)
        //         {
        //             if(nums[i]+nums[j]+nums[k]==0)
        //             {
        //                 List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k]);
        //                 Collections.sort(temp);
        //                 set.add(temp);
        //             }
        //         }
        //     }
             
        // }
        // List<List<Integer>>arr=new ArrayList<>(set);
        // return arr;

         HashSet<List<Integer>>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            HashSet<Integer>hm=new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
               int third=-(nums[i]+nums[j]);
               if(hm.contains(third))
               {
                   List<Integer>temp=Arrays.asList(nums[i],nums[j],third);
                   Collections.sort(temp);
                   set.add(temp);
               }
               hm.add(nums[j]);
            }
        }
        List<List<Integer>>ls=new ArrayList<>(set);
        return ls;

        
    }
}