class Solution {
    public boolean isHappy(int n) {
        List<Integer> list=new ArrayList<>();
        return happy(n,list);
    }
    boolean happy(int n,List<Integer> list){
        if(n==1){
            return true;
        }
        if(list.contains(n)){
            return false;
        }
        else{
            list.add(n);
        }
        int sum=0;
        while(n>0){
            sum=sum+(int)Math.pow(n%10,2);
            n/=10;
        }
        return happy(sum,list);
    }
}