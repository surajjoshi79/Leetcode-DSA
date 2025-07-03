class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(" ")){
            return true;
        }
        s=s.toLowerCase();
        s=s.replaceAll(" ","");
        int i=0,j=s.length()-1;
        while(i<=j){
            if(!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetter(s.charAt(j)) && !Character.isDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        /*String a="";
        String b="";
        for(char c:s.toCharArray()){
            if((c>=97 && c<=122) || (c>=48 && c<=57)){
                a+=c;
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            if((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=48 && s.charAt(i)<=57)){
                b+=s.charAt(i);
            }
        }
        if(a.equals(b)){
            return true;
        }
        return false;*/
        return true;
    }
}