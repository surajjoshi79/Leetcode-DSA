class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list=new ArrayList<>(Arrays.asList(words));
        int i=1;
        while(i<list.size()){
            if(checkAnagrams(list.get(i),list.get(i-1))){
                list.remove(i);
            }else{
                i++;
            }
        }
        return list;
    }
    private boolean checkAnagrams(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(new String(c1).equals(new String(c2))){
            return true;
        }
        return false;
    }
}