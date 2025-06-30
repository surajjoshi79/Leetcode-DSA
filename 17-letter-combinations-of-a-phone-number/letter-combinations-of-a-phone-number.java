class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.equals("")){
            return ans;
        }
        char[] nums=new char[digits.length()];
        for(int i=0;i<digits.length();i++){
            nums[i]=digits.charAt(i);
        }
        return helper(nums,0,"",ans) ;  
    }
    static List<String> helper(char[] num,int index,String str,List<String> ans){
        if(str.length()==num.length){
            ans.add(str);
            return ans;
        }
        for(int i=index;i<num.length;i++){
            if(num[i]=='2'){
                helper(num,i+1,str+"a",ans);
                helper(num,i+1,str+"b",ans);
                helper(num,i+1,str+"c",ans);
            }
            if(num[i]=='3'){
                helper(num,i+1,str+"d",ans);
                helper(num,i+1,str+"e",ans);
                helper(num,i+1,str+"f",ans);
            }
            if(num[i]=='4'){
                helper(num,i+1,str+"g",ans);
                helper(num,i+1,str+"h",ans);
                helper(num,i+1,str+"i",ans);
            }
            if(num[i]=='5'){
                helper(num,i+1,str+"j",ans);
                helper(num,i+1,str+"k",ans);
                helper(num,i+1,str+"l",ans);
            }
            if(num[i]=='6'){
                helper(num,i+1,str+"m",ans);
                helper(num,i+1,str+"n",ans);
                helper(num,i+1,str+"o",ans);
            }
            if(num[i]=='7'){
                helper(num,i+1,str+"p",ans);
                helper(num,i+1,str+"q",ans);
                helper(num,i+1,str+"r",ans);
                helper(num,i+1,str+"s",ans);
            }
            if(num[i]=='8'){
                helper(num,i+1,str+"t",ans);
                helper(num,i+1,str+"u",ans);
                helper(num,i+1,str+"v",ans);
            }
            if(num[i]=='9'){
                helper(num,i+1,str+"w",ans);
                helper(num,i+1,str+"x",ans);
                helper(num,i+1,str+"y",ans);
                helper(num,i+1,str+"z",ans);
            }
        }
        return ans;
    }
}