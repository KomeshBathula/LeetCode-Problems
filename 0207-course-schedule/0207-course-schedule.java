class Solution {
    private static boolean dfs(ArrayList<ArrayList<Integer>> adjList, int node, int[] state, Stack<Integer> st) {
        state[node] = 1;

        for (int neighbor : adjList.get(node)) {
            if (state[neighbor] == 0) {
                if (!dfs(adjList, neighbor, state, st))
                    return false;
            }
            else if (state[neighbor] == 1) 
                return false;
        }
        state[node] = 2;
        st.push(node);
        return true;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        int e = prerequisites.length;
        for (int i = 0; i < e; i++) {
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            adjList.get(v).add(u);
        }
        int[] state = new int[numCourses];

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < numCourses; i++) {
            if (state[i] == 0) 
                if (!dfs(adjList, i, state, st))
                    return false;
        }

        return true;
    }
}