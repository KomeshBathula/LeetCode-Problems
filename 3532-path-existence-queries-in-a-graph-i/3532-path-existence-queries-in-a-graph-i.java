class DSU {
    int n;
    int[] parent;
    int[] size;

    DSU(int _n) {
        n = _n;
        parent = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    int findParent(int i) {
        if (parent[i] == i) 
            return i;
        
        return parent[i] = findParent(parent[i]);
    }

    void unionBySize(int u, int v) {
        int uPar = findParent(u);
        int vPar = findParent(v);

        if (uPar == vPar) return;

        if (size[uPar] < size[vPar]) {
            parent[uPar] = vPar;
            size[vPar] += size[uPar];
        }
        else {
            parent[vPar] = uPar;
            size[uPar] += size[vPar];
        }
    }
}
class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        DSU dsu = new DSU(n);
        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] <= maxDiff) 
                dsu.unionBySize(i, i - 1);
        }

        boolean[] answer = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            answer[i] = dsu.findParent(queries[i][0]) == dsu.findParent(queries[i][1]);
        }

        return answer;
    }
}