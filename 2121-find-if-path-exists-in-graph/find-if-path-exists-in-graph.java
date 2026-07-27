class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int [] edge :edges){
            l.get(edge[0]).add(edge[1]);
            l.get(edge[1]).add(edge[0]);
        }
        boolean [] visited=new boolean[n];
        return dfs(l,visited,source,destination);
    }

        public boolean dfs(List<List<Integer>> l,boolean[] visited,int src,int dest){
            if(src==dest)
                return true;
            visited[src]=true;
            for(int n:l.get(src)){
                if(!visited[n]){
                    boolean res=dfs(l,visited,n,dest);
                    if(res)
                    return true;
                }
            }
            return false;
        }
        
    }
