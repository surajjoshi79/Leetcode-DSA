class Solution {
    public String minWindow(String s, String t) {
        if(t.equals("")){
            return t;
        }
        HashMap<Character,Integer> window=new HashMap<>();
        HashMap<Character,Integer> countT=new HashMap<>();
        int start=-1,length=Integer.MAX_VALUE;
        int l=0;
        for(char c:t.toCharArray()){
            countT.put(c,countT.getOrDefault(c,0)+1);
        }
        int have=0,need=countT.size();
        for(int r=0;r<s.length();r++){
            window.put(s.charAt(r),window.getOrDefault(s.charAt(r),0)+1);
            if(countT.containsKey(s.charAt(r)) && countT.get(s.charAt(r)).equals(window.get(s.charAt(r)))){
                have++;
            }
            while(have==need){
                if((r-l+1)<length){
                    length=r-l+1;
                    start=l;
                }
                window.put(s.charAt(l),window.get(s.charAt(l))-1);
                if(countT.containsKey(s.charAt(l)) && countT.get(s.charAt(l))>window.get(s.charAt(l))){
                    have--;
                }
                l++;
            }
        }
        if(length==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+length);
    }
}