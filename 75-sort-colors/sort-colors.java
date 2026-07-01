class Solution {
    public void sortColors(int[] nums) {
        int white=0;
        int red=0;
        int blue=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                red++;
            }
            else if(nums[i]==1){
                white++;
            }
            else if(nums[i]==2){
                blue++;
            }
        }
        int index=0;
        while(red>0){
            nums[index++]=0;
            red--;
        }
        while(white>0){
            nums[index++]=1;
            white--;

        }
        while(blue>0){
            nums[index++]=2;
            blue--;
        }

        
        
    }
}