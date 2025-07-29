class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        helper(n,0,0,list,"");
        return list;
    }
    void helper(int n,int open,int closed,List<String> list,String str){
        if(open==closed && closed==n){
            list.add(new String(str));
            return ;
        }
        if(open<n){
            helper(n,open+1,closed,list,str+"(");
        }
        if(open>closed){
            helper(n,open,closed+1,list,str+")");
        }
    }
}