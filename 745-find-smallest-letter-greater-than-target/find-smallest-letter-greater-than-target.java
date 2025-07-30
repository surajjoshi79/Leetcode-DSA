class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters[0]>target){
            return letters[0];
        }
        int l=1,h=letters.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(letters[mid]>target && letters[mid-1]<=target){
                return letters[mid];
            }
            else if(letters[mid]<=target){
                l=mid+1;
            }
            else if(letters[mid]>target && letters[mid-1]>target){
                h=mid-1;
            }
        }
        return letters[0];
    }
}