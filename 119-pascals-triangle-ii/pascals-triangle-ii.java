class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            Integer[] temp=new Integer[i+1];
            Arrays.fill(temp,1);
            pascal.add(Arrays.asList(temp));
        }
        if(rowIndex>=2){
            for(int i=2;i<=rowIndex;i++){
                for(int j=1;j<pascal.get(i).size()-1;j++){
                    pascal.get(i).set(j,pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j));
                }
            }
        }
        ans.addAll(pascal.get(rowIndex));
        return ans;
    }
}