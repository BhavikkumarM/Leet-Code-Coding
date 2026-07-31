class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, nums, new ArrayList<>(), 0);
        return res;
    }
    public void backTrack(List<List<Integer>> res, int[] nums, List<Integer> subset, int start) {
        res.add(new ArrayList<>(subset)); 
        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]); 
            backTrack(res, nums, subset, i + 1);
            subset.remove(subset.size() - 1); 
        }
    }
}
