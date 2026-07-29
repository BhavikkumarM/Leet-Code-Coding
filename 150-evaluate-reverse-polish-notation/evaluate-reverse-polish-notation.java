class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();
        for(String token: tokens){
            if(isOperator(token)){
                int b =stack.pop();
                int a= stack.pop();

                switch(token){
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                }

            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
    public boolean isOperator(String s){
        return(s.equals("-")||s.equals("+")||s.equals("*")||s.equals("/"));
    }   
}