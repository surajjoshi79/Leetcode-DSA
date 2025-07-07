class Solution {
    public String reverseStr(String s, int k) {
        if(s.length()<k){
            char[] c=s.toCharArray();
            int i=0,j=s.length()-1;
            while(i<j){
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                i++;
                j--;
            }
            return new String(c);
        }
        if(s.length()<2*k){
            char[] c=s.toCharArray();
            int i=0,j=k-1;
            while(i<j){
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                i++;
                j--;
            }
            return new String(c);
        }
        char[] c=s.toCharArray();
        int i=0,j=k-1;
        while(i<j){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        String str=new String(c);
        StringBuilder sb=new StringBuilder();
        sb.append(str.substring(0,2*k));
        sb.append(reverseStr(str.substring(2*k,str.length()),k));
        return sb.toString();
    }
}