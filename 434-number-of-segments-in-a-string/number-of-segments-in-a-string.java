class Solution {
    public int countSegments(String s) {
        if(s.trim().equals("")){
            return 0;
        }
        String[] str=s.trim().split(" ");
        int count=str.length;
        for(String st:str){
            if(st.trim().equals("")){
                count--;
            }
        }
        return count;
    }
}