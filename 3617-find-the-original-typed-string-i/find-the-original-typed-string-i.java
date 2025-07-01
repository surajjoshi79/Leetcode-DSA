class Solution {
    public int possibleStringCount(String word) {
        int count=0,i=0,j=1;
        while(j<word.length()){
            if(word.charAt(i)==word.charAt(j)){
                count++;
            }
            i++;
            j++;
        }
        return count+1;
    }
}