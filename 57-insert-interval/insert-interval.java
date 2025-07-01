class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] newIntervals=new int[intervals.length+1][2];
        int i=0;
        for(i=0;i<intervals.length;i++){
            newIntervals[i][0]=intervals[i][0];
            newIntervals[i][1]=intervals[i][1];
        }
        newIntervals[i][0]=newInterval[0];
        newIntervals[i][1]=newInterval[1];
        return merge(newIntervals);
    }
    int[][] merge(int[][] intervals){
        List<int[]> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        for(int[] interval:intervals){
            if(list.isEmpty() || list.get(list.size()-1)[1]<interval[0]){
                list.add(interval);
            }
            else{
                list.get(list.size()-1)[1]=Math.max(list.get(list.size()-1)[1],interval[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}