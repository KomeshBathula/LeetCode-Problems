class DSU {
    int n;
    int[] parent;
    int[] rank;

    DSU(int _n) {
        n = _n;
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) 
            parent[i] = i;
    }

    int find(int i) {
        if (parent[i] == i) 
            return i;

        return parent[i] = find(parent[i]);
    }

    void unionByRank(int u, int v) {
        int uPar = find(u);
        int vPar = find(v);

        if (uPar != vPar) {
            if (rank[uPar] < rank[vPar]) 
                parent[uPar] = vPar;
            else if (rank[uPar] > rank[vPar])
                parent[vPar] = uPar;
            else {
                parent[uPar] = vPar;
                // becoz of vPar becomes the root of uPar
                rank[vPar]++;
            }
        }
    }
}

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        DSU dsu = new DSU(n);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 1) 
                    dsu.unionByRank(i, j);
            }
        }

        int countOfProvinces = 0;
        for (int i = 0; i < n; i++) {
            if (dsu.find(i) == i) // count only which connects to itself
                countOfProvinces++;
        }

        return countOfProvinces;
    }
}