class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if(isVowel(arr[i]) && isVowel(arr[j])){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            if(!isVowel(arr[j])){
                j--;
            }
            if(!isVowel(arr[i])){
                i++;
            }
        }
        return new String(arr);
    }
    boolean isVowel(char c){
        if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u'||c=='A'||c=='I'||c=='E'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
}