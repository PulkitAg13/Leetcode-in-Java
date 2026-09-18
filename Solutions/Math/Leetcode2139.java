class Solution {
    public int minMoves(int target, int maxDoubles) {
        int moves = 0;
        if(maxDoubles == 0 && target > 1){
            return target - 1;
        }
        while(target > 1){
            if(target % 2 == 0 && maxDoubles > 0){
                target = target / 2;
                maxDoubles--;
            }else if(maxDoubles == 0){
                return moves + target - 1;
            }else{
                target--;
            }
            moves++;
        }
        return moves;
    }
}
