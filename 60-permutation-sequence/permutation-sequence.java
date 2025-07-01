class Solution {
    public String getPermutation(int n, int k) {
        List<String> list=new ArrayList<>();
        boolean[] visited=new boolean[n+1];
        helper(n,k,list,"",visited);
        return list.get(k-1);
    }
    void helper(int n,int k,List<String> list,String str,boolean[] visited){
        if(str.length()==n){
            list.add(new String(str));
            return ;
        }
        if(list.size()==k){
            return;
        }
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                visited[i]=true;
                helper(n,k,list,str+Integer.toString(i),visited);
                visited[i]=false;
            }
        }
    }
}