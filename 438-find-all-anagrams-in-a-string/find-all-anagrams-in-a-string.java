class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if(s.length()<p.length()){
            return list;
        }
        int i=0,j=p.length();
        char[] c=p.toCharArray();
        Arrays.sort(c);
        String str=new String(c);
        while(j<=s.length()){
            char[] c1=s.substring(i,j).toCharArray();
            Arrays.sort(c1);
            if(str.equals(new String(c1))){
                list.add(i);
            }
            i++;
            j++;
        }
        return list;
    }
}