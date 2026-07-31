import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backTrack(res, visited, nums, new ArrayList<>());
        return res;
    }

    public void backTrack(List<List<Integer>> res, boolean[] visited, int[] nums, List<Integer> subList) {
        if (nums.length == subList.size()) {
            res.add(new ArrayList<>(subList)); // add a copy of current permutation
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            subList.add(nums[i]);
            backTrack(res, visited, nums, subList);

            subList.remove(subList.size() - 1); 
            visited[i] = false;
        }
    }
}
