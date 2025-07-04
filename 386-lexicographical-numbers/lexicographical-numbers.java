class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(String.valueOf(i));
        }
        Collections.sort(list);
        List<Integer> res=new ArrayList<>();
        for(String s:list){
            res.add(Integer.parseInt(s));
        }
        return res;
    }
}