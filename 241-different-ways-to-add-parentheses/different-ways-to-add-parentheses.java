class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<expression.length();i++)
        {
            char ch=expression.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*')
            {
                List<Integer>left = diffWaysToCompute(expression.substring(0,i));
                List<Integer>right = diffWaysToCompute(expression.substring(i+1));
                //after that on the basis of operator you need to calcuate the res
                //ex:_ left=[2,3] && right=[1,2]
                //if op==*
                //res=[2*1,2*2,3*1,3*2]
                for(int x:left)
                {
                    for(int y:right)
                    {
                        if(ch=='+')
                        {
                            res.add(x+y);
                        }
                        else if(ch=='-')
                        {
                            res.add(x-y);
                        }
                        else{
                            res.add(x*y);
                        }
                    }
                }
            }
            //edge case 
            //just in case if there are no operators itll never get into if 
            //so in that case just return the number
        }
        if(res.isEmpty())
        {
            res.add(Integer.parseInt(expression));
        }
        return res;
    }
}