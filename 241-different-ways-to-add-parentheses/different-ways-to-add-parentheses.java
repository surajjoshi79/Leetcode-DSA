class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        return helper(expression, 0, expression.length() - 1);
    }
    List<Integer> helper(String expression, int i, int n){
        List<Integer> list=new ArrayList<>();
        for(int index=i;index<n;index++){
            char op=expression.charAt(index);
            if(op=='+' || op=='-' || op=='*'){
                List<Integer> nums1=helper(expression, i, index-1);
                List<Integer> nums2=helper(expression, index+1, n);
                for (int n1 : nums1) {
                    for (int n2 : nums2) {
                        if(op=='+'){
                            list.add(n1+n2);
                        }else if(op=='-'){
                            list.add(n1-n2);
                        }else{
                            list.add(n1*n2);
                        }
                    }
                }
            }
        }
        if(list.isEmpty()){
            list.add(Integer.parseInt(expression.substring(i,n+1)));
        }
        return list;
    }
}