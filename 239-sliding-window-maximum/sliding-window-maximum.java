class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        /*if(nums.length==0){
            return new int[1];
        }
        List<Integer> list=new ArrayList<>();
        int i=0;
        int max=Integer.MIN_VALUE;
        while(i<k){
            max=Math.max(nums[i],max);
            i++;
        }
        list.add(max);
        for(i=k;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            list.add(max);
        }
        int[] arr=new int[list.size()];
        int index=0;
        for(int n:list){
            arr[index]=n;
            index++;
        }
        return arr;*/
        int n=nums.length;
        int[] r=new int[n-k+1];
        int ri=0;
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                r[ri++]=nums[q.peek()];
            }
        } 
        return r;
    }
}