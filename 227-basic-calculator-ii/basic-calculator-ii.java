class Solution {
    public int precedence(char a)
    {
        if(a=='+')
        {
            return 1;
        }
        else if(a=='-')
        {
            return 1;
        }
        else if(a=='*')
        {
            return 2;
        }
        else if(a=='/')
        {
            return 2;
        }
        return 0;
    }

    public int operation(int a,int b,char ab)
    {
        if(ab=='+')
        {
            return a+b;
        }
        else if(ab=='-')
        {
            return a-b;
        }
        else if(ab=='*')
        {
            return a*b;
        }
        else if(ab=='/')
        {
            return a/b;
        }
        return 0;

    }
    public int calculate(String s) {


        

        // Stack<Integer>numbers=new Stack<>();
        // Stack<Character>symbols=new Stack<>();

    

        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);

        //     if(ch=='(')
        //     {
        //         symbols.push(ch);
        //     }
        //     else if(ch==')')
        //     {
        //         while(symbols.peek()!='(')
        //         {
        //            char optr = symbols.pop();

        //            int v1=numbers.pop();
        //            int v2=numbers.pop();

        //            int opv=operation(v2,v1,optr);
        //            numbers.push(opv);
        //         }
        //         //remove the ( bracket
        //         symbols.pop();
        //     }
        //     else if(Character.isDigit(ch))
        //     {
        //         numbers.push(ch-'0');
        //     }
        //     else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
        //     {
        //         while(symbols.size()>0 && symbols.peek()!='(' && precedence(ch)<=precedence(symbols.peek()))
        //         {
        //             //do the same job were doing with )
        //             char optr = symbols.pop();

        //            int v1=numbers.pop();
        //            int v2=numbers.pop();

        //            int opv=operation(v2,v1,optr);
        //            numbers.push(opv);

        //         }
        //         //push the symbol
        //         symbols.push(ch);

        //     }
        // }
        // //might be a case where the symbols are not empty// so we do operation manually until size ==0
        // if(symbols.size()<0)
        // {
        //     return Integer.parseInt(s);
        // }
        // while(symbols.size()>0)
        // {
        //     char optr = symbols.pop();

        //            int v1=numbers.pop();
        //            int v2=numbers.pop();

        //            int opv=operation(v2,v1,optr);
        //            numbers.push(opv);

        // }
        // //numbers ka peek me jo last element bachega wahi ans hai
        

        // return numbers.peek();




         Stack<Integer> numbers = new Stack<>();
    Stack<Character> symbols = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        if (ch == '(') {
            symbols.push(ch);
        } else if (ch == ')') {
            while (symbols.peek() != '(') {
                char optr = symbols.pop();

                int v1 = numbers.pop();
                int v2 = numbers.pop();

                int opv = operation(v2, v1, optr);
                numbers.push(opv);
            }
            // Remove the '(' bracket
            symbols.pop();
        } else if (Character.isDigit(ch)) {
            // Handle multi-digit numbers
            int num = 0;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
                i++;
            }
            // Decrease i to account for the extra increment in the loop
            i--;
            numbers.push(num);
        } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            while (!symbols.isEmpty() && symbols.peek() != '(' && precedence(ch) <= precedence(symbols.peek())) {
                char optr = symbols.pop();

                int v1 = numbers.pop();
                int v2 = numbers.pop();

                int opv = operation(v2, v1, optr);
                numbers.push(opv);
            }
            // Push the symbol
            symbols.push(ch);
        }
    }

    // Handle the case where the symbols stack is not empty after the loop
    while (!symbols.isEmpty()) {
        char optr = symbols.pop();
        int v1 = numbers.pop();
        int v2 = numbers.pop();
        int opv = operation(v2, v1, optr);
        numbers.push(opv);
    }

    // The result will be at the top of the numbers stack
    return numbers.peek();



      

        
        
    }
    }
