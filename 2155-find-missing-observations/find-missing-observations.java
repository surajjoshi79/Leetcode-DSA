class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum=0,m=rolls.length;
        for(int i=0;i<m;i++){
            sum+=rolls[i];
        }
        int remaining=mean*(m+n)-sum;
        if(remaining>(6*n) || remaining<n){
            return new int[0];
        }
        int[] res=new int[n];
        int base=remaining/n;
        int remainder=remaining%n;
        for(int i=0;i<n;i++){
            res[i]=base+(i<remainder?1:0);
        }
        return res;
        //List<int[]> list=new ArrayList<>();
        //return helper(res,0,remaining,n,list).get(0);
    }
    /*List<int[]> helper(int[] res,int index,int remaining,int total,List<int[]> list){
        if(remaining==0 && index==total){
            int[] arr=Arrays.copyOf(res,index);
            list.add(arr);
        }
        if(list.size()==1){
            return list;
        }
        if(index==total){
            return list;
        }
        for(int i=1;i<=6;i++){
            if(remaining-i<0){
                break;
            }
            res[index]=i;
            helper(res,index+1,remaining-i,total,list);
            res[index]=0;
        }
        return list;
    }*/
}