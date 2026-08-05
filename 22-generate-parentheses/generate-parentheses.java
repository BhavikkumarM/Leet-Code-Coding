class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> res=new ArrayList<>();
        String s="";
        generate(s,res,0,0,n);
    return res;        
             
    }

    public void generate(String s,List<String> res,int open,int close,int n){
        if(open == close && open+close ==2*n){
            res.add(s);
            return;
        }
        if(open>n || close>n) return ;
        generate(s+"(",res,open+1,close,n);
        if(open >close){
            generate(s+")",res,open,close+1,n);
        }
     }
}