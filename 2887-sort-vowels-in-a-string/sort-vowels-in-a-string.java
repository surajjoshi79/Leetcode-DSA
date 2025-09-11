class Solution {
    public String sortVowels(String s) {
        int vowel=0;
        char[] t1=new char[s.length()];
        Arrays.fill(t1,' ');
        for(int i=0;i<s.length();i++){
            if(!isVowel(s.charAt(i))){
                t1[i]=s.charAt(i);
            }else{
                vowel++;
            }
        }
        char[] t2=new char[vowel];
        int index=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                t2[index++]=s.charAt(i);
            }
        }
        Arrays.sort(t2);
        index=0;
        for(int i=0;i<s.length();i++){
            if(t1[i]==' '){
                t1[i]=t2[index++];
            }
        }
        return new String(t1);
    }
    boolean isVowel(char c){
        switch(c){
            case 'a':
            case 'i':
            case 'e':
            case 'o':
            case 'u':
            case 'A':
            case 'I':
            case 'E':
            case 'O':
            case 'U':return true;
            default:return false;
        }
    }
}