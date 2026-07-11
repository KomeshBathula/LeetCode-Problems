class Solution {
    int nodes;
    int edges;

    private void DFS(boolean[] visited, int node, ArrayList<ArrayList<Integer>> edgeList) {
        visited[node] = true;
        nodes++;
        edges += edgeList.get(node).size();

        for (int adjNode : edgeList.get(node)) {
            if (!visited[adjNode]) {
                DFS(visited, adjNode, edgeList);
            }
        }
    }

    public int countCompleteComponents(int n, int[][] graph) {
        // make an arraylist
        ArrayList<ArrayList<Integer>> edgeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edgeList.add(new ArrayList<>());
        }

        for (int i = 0; i < graph.length; i++) {
            int u = graph[i][0];
            int v = graph[i][1];
            edgeList.get(u).add(v);
            edgeList.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                nodes = 0;
                edges = 0;

                DFS(visited, i, edgeList);

                edges /= 2;

                if (edges == nodes * (nodes - 1) / 2)
                    count++;
            }
        }

        return count;
    }
}