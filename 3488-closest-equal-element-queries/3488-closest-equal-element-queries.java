class Solution {

    public int lowerBound(ArrayList<Integer> arr, int target) {
        int low = 0, high = arr.size();
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) >= target) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    public List<Integer> solveQueries(int[] nums, int[] queries) {
        // List<Integer> ans = new ArrayList<>();
        // for (int qIndex = 0; qIndex < queries.length; qIndex++) {
        //     int valueAtQIndex = nums[queries[qIndex]];
        //     for (int numsIndex = 0; numsIndex < nums.length; numsIndex++) {
        //         if (nums[numsIndex] == valueAtQIndex && qIndex != numsIndex) {
        //             ans.add(numsIndex);
        //             break;
        //         }
        //         else {
        //             ans.add(-1);
        //             break;
        //         }
        //     }
        // }
        // return ans;


        // above code is not working 



        int n = nums.length;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int qi : queries) {
            int el = nums[qi];

            ArrayList<Integer> temp = map.get(el);
            
            int sz = temp.size();

            if (sz == 1) {
                ans.add(-1);
                continue;
            }

            int pos = lowerBound(temp, qi);

            int res = Integer.MAX_VALUE;

            int right = temp.get((pos + 1) % sz);
            int d = Math.abs(qi - right);
            int circularDist = n - d;
            res = Math.min(res, Math.min(d, circularDist));

            int left = temp.get((pos - 1 + sz) % sz);
            d = Math.abs(qi - left);
            circularDist = n - d;
            res = Math.min(res, Math.min(d, circularDist));

            ans.add(res);
        }

        return ans;
    }
}