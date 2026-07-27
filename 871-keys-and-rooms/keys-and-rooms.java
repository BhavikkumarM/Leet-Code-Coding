import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        
        dfs(rooms, visited, 0);  // start from room 0
        
        for (boolean v : visited) {
            if (!v) return false;  // if any room not visited
        }
        return true;
    }

    private void dfs(List<List<Integer>> rooms, boolean[] visited, int roomIndex) {
        if (visited[roomIndex]) return;  // already visited
        visited[roomIndex] = true;       // mark current room
        
        for (int key : rooms.get(roomIndex)) {
            dfs(rooms, visited, key);    // explore rooms accessible by keys
        }
    }
}
