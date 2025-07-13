class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int match=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=players.length-1,j=trainers.length-1;
        while(i>=0 && j>=0){
            if(players[i]<=trainers[j]){
                match++;
                i--;
                j--;
            }
            else{
                i--;
            }
        }
        return match;
    }
}