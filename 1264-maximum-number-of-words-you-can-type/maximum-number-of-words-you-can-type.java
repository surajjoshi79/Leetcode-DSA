class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        for(String str:text.split(" ")){
            boolean contains=false;
            for(char a:brokenLetters.toCharArray()){
                if(str.contains(Character.toString(a))){
                    contains=true;
                    break;
                }
            }
            if(!contains){
                count++;
            }
        }
        return count;
    }
}