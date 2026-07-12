class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        Map<Integer, Integer> ranks = new HashMap<>();
        int rank = 1;
        for (int x : sortedArr) {
            if (!ranks.containsKey(x)) {
                ranks.put(x, rank);
                rank++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ranks.get(arr[i]);
        }

        return arr;
    }
}