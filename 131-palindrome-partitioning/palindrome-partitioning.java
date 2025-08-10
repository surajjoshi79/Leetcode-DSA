class Solution {
    public List<List<String>> partition(String s) {
        List<String> smallList=new ArrayList<>();
        List<List<String>> bigList=new ArrayList<>();
        helper(s,0,smallList,bigList);
        return bigList;
    }
    void helper(String s,int index,List<String> smallList,List<List<String>> bigList){
        if(index>=s.length()){
            bigList.add(new ArrayList<>(smallList));
            return ;
        }
        for(int j=index;j<s.length();j++){
            if(palindrome(s,index,j)){
                smallList.add(s.substring(index,j+1));
                helper(s,j+1,smallList,bigList);
                smallList.remove(smallList.size()-1);
            }
        }
    }
    boolean palindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}