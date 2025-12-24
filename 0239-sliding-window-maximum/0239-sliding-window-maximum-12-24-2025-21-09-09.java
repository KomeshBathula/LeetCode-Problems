class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int result[] = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i])
                dq.removeFirst();
            dq.addLast(i);
        }
        result[0] = nums[dq.peekFirst()];
        for (int i = k; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) 
                dq.removeFirst();
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) 
                dq.removeLast();
            dq.addLast(i);
            result[i - k + 1] = nums[dq.peekFirst()];
        }
        return result;
    }
}