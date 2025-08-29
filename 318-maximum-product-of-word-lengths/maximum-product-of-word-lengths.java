class Solution {
    public int maxProduct(String[] words) {
        //bit masking
        int[] values=new int[words.length];
        int index=0;
        for(String word:words){
            for(char c:word.toCharArray()){
                values[index] |=1<<(c-'a');
            }
            index++;
        }
        //for finding max product
        int max=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if((values[i]&values[j])==0){
                    max=Math.max(max,words[i].length()*words[j].length());
                }
            }
        }
        return max;
    }
}