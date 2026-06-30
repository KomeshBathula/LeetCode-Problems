class Solution {
    private static void DFS(boolean[] visited, int node, List<List<Integer>> edgeList) {
        visited[node] = true;
        for (int adjNode : edgeList.get(node)) {
            if (!visited[adjNode]) 
                DFS(visited, adjNode, edgeList);
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                DFS(visited, i, rooms);
            }
        }

        return count == 1;
    }
}