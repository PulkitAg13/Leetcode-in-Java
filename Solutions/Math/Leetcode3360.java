class Solution {
    public boolean canAliceWin(int n) {
        if(n > 48){
            return true;
        }else if(n > 44){
            return false;
        }else if(n > 39){
            return true;
        }else if(n > 33){
            return false;
        }else if(n > 26){
            return true;
        }else if(n > 18){
            return false;
        }else if(n > 9){
            return true;
        }else{
            return false;
        }
    }
}
