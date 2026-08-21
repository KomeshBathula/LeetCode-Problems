class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        // sort the heaters to find the nearest houses
        Arrays.sort(heaters);

        int answer = 0;

        for (int house : houses) {
            // find first heater >= house
            int left = 0, right = heaters.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (heaters[mid] < house) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            int rightDistance = Integer.MAX_VALUE;
            int leftDistance = Integer.MAX_VALUE;

            // check if it exists in the bound
            if (left < heaters.length) {
                rightDistance = heaters[left] - house;
            }
            // check if left exists on the bound
            if (left > 0) {
                leftDistance = house - heaters[left - 1];
            }

            int nearest = Math.min(rightDistance, leftDistance);

            answer = Math.max(answer, nearest);
        }

        return answer;
    }
}