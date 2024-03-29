// class Solution {
//     public List<List<String>> partition(String s) {
        
//         List<List<String>>ans=new ArrayList<>();
//         List<String>ds=new ArrayList<>();
//         backtrack(0,s,ans,ds);
//         return ans;
//     }
//     public void backtrack(int index,String s,List<List<String>>ans,List<String>ds)
//     {
//         if(index==s.length())
//         {
//             ans.add(new ArrayList<>(ds));
//             return;
//         }
//         for(int i=index;i<s.length();i++)
//         {
//             if(ispalindrome(s,index,i))
//             {
//                 ds.add(s.substring(index,i+1));
//                 backtrack(i+1,s,ans,ds);
//                 ds.remove(ds.size()-1);
//             }
//         }
//     }
//     boolean ispalindrome(String s,int start,int end)
//     {
//         while(start<=end)
//         {
//             if(s.charAt(start++)!=s.charAt(end--))
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
// }


















class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>path=new ArrayList<>();
        solve(0,ans,path,s);
        return ans;
    }
    public void solve(int index, List<List<String>>ans,List<String>path,String s)
    {
        //base case
        //agar last index tk pohoch gaya to
        if(index==s.length())
        {
            ans.add(new ArrayList<>(path));
            return;
        }
        //run a loop from 0 to last index to check each partion
        for(int i=index;i<s.length();i++)
        {
            if(isValid(s,index,i)==true)
            {
                //agar valid to path me substring ko add kardo 
                //from index to i
                path.add(s.substring(index,i+1));
                //call the recursion for i+1
                solve(i+1,ans,path,s);
                //while backtracking remove the added barrier/partition
                path.remove(path.size()-1);
            }
        }
    }
    boolean isValid(String s,int index,int i)
    {
        while(index<=i)
        {
            if(s.charAt(index)!=s.charAt(i))
            {
                return false;
            }
            index++;
            i--;
        }
        return true;
    }
}