class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // pointer for children
        int j = 0; // pointer for cookies
        int count = 0;
        // Try to satisfy children one by one
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                // Cookie satisfies child
                count++;
                i++;
                j++;
            } else {
                // Cookie too small, try next cookie
                j++;
            }
        }
        return count;
    }
}