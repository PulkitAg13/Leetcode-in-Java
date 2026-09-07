class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 1){
                i++;
            }else{
                if(i <= flowerbed.length-2 && flowerbed[i+1] == 1){
                    continue;
                }
                flowerbed[i] = 1;
                n--;
                i++;
            }
        }
        if(flowerbed.length > 1 && flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0){
            n--;
            flowerbed[flowerbed.length-1] = 1;
        }
        if(n <= 0){
            return true;
        }
        return false;
    }
}
