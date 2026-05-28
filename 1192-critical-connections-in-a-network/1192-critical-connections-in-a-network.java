class Solution {
    // Instance variable to keep track of the timer
    private int timer = 1;

    private void dfs(int node, int parent, boolean[] vis, 
                        int[] timeOfInsertion, int[] lowTime, ArrayList<ArrayList<Integer>> adj, List<List<Integer>> bridges) {
        vis[node] = true;
        timeOfInsertion[node] = lowTime[node] = timer;
        // for next node increase timer
        timer++;

        for (Integer it : adj.get(node)) {
            // no check for parents
            if (it == parent) continue;

            if (!vis[it]) {
                dfs(it, node, vis, timeOfInsertion, lowTime, adj, bridges);

                lowTime[node] = Math.min(lowTime[node], lowTime[it]);

                if (lowTime[it] > timeOfInsertion[node]) 
                    bridges.add(Arrays.asList(it, node));
            }

            else {
                lowTime[node] = Math.min(lowTime[node], lowTime[it]);
            }
        }
    }

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < connections.size(); i++) {
            int u = connections.get(i).get(0);
            int v = connections.get(i).get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] vis = new boolean[n];
        int[] timeOfInsertion = new int[n], lowTime = new int[n];

        List<List<Integer>> bridges = new ArrayList<>();
        dfs(0, -1, vis, timeOfInsertion, lowTime, adj, bridges);

        return bridges;
    }
}