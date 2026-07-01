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
        if (i == parent[i]) return i;

        return parent[i] = findParent(parent[i]);
    }

    void unionBySize(int u, int v) {
        int ulp_u = findParent(u);
        int ulp_v = findParent(v);

        if (ulp_u == ulp_v) return;

        if (size[ulp_u] < size[ulp_v]) {
            parent[ulp_u] = ulp_v;
            size[ulp_v] += size[ulp_u];
        }

        else {
            parent[ulp_v] = ulp_u;
            size[ulp_u] += size[ulp_v];
        }
    }
}

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        // can be implemented using DSU
        int n = accounts.size();
        DSU ds = new DSU(n);
        // to store the mails were seen previously or not 
        HashMap<String, Integer> map = new HashMap<>();
        // go through every account 
        for (int i = 0; i < n; i++) {
            // start from 1 because 0th index contains name
            for (int j = 1; j < accounts.get(i).size(); j++) {
                String mail = accounts.get(i).get(j);
                // check if it is already in hashmap
                if (!map.containsKey(mail)) 
                    map.put(mail, i);
                else // merge those two accounts as they belong to one 
                    ds.unionBySize(i, map.get(mail));
            }
        }

        // now get all the emails of into one single list 
        ArrayList<String>[] mergedMail = new ArrayList[n];
        for (int i = 0; i < n; i++) mergedMail[i] = new ArrayList<>();

        for (Map.Entry<String, Integer> it : map.entrySet()) {
            String mail = it.getKey();
            // get the ultimate parent of that node
            int node = ds.findParent(it.getValue());
            mergedMail[node].add(mail);
        }

        // Now create the final list
        List<List<String>> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // if that node does not have any mails mapped to it leave it
            if (mergedMail[i].size() == 0) continue;
            Collections.sort(mergedMail[i]);
            List<String> temp = new ArrayList<>();
            // add the name first
            temp.add(accounts.get(i).get(0));
            for (String s : mergedMail[i]) 
                temp.add(s);
            answer.add(temp);
        }

        return answer;
    }
}