class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // using BFS
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int n = numCourses;
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        int e = prerequisites.length;
        for (int i = 0; i < e; i++) {
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            adjList.get(v).add(u);
        }
        int[] ind = new int[n];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int x : adjList.get(i)) 
                ind[x]++;
        }

        for (int i = 0; i < n; i++) {
            if (ind[i] == 0) 
                q.add(i);
        }

        int[] ans = new int[n];
        int idx = 0;
        while (!q.isEmpty()) {
            int curr = q.poll();
            ans[idx++] = curr;

            for (int neighbor : adjList.get(curr)) {
                ind[neighbor]--;
                if (ind[neighbor] == 0) 
                    q.add(neighbor);
            }
        }

        if (idx == n) 
            return ans;
        return new int[]{};
    }
}