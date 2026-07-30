class Solution {
    public int rob(int[] nums) {
        int pre1=0;
        int pre2=0;
        for(int n:nums){
            int current=Math.max(pre1,pre2+n);
            pre2=pre1;
            pre1=current;
        }
        return pre1;

        
    }
}