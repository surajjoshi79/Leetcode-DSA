class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*int i=0;
        while(i<numbers.length){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    int[] arr={i+1,j+1};
                    return arr;
                }
            }
            i++;
        }
        return new int[2];*/
        int i=0,j=numbers.length-1;
        while(i<=j){
            if(numbers[i]+numbers[j]==target){
                int[] arr={i+1,j+1};
                return arr;
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[2];
    }
}