import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); 
        boolean[] visited = new boolean[nums.length];
        backTrack(res, new ArrayList<>(), visited, nums);
        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> sublist, boolean[] visited, int[] nums) {
        if (sublist.size() == nums.length) {
            res.add(new ArrayList<>(sublist));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;

            visited[i] = true;
            sublist.add(nums[i]);

            backTrack(res, sublist, visited, nums);

            sublist.remove(sublist.size() - 1);
            visited[i] = false;
        }
    }
}
