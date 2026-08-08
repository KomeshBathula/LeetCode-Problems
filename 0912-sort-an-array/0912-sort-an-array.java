class Solution {
    private void mergeSort(int low, int high, int[] nums) {
        if (low >= high) return;
        // use this formula to bypass any overflow errors of integer
        int mid = low + (high - low) / 2;
        mergeSort(low, mid, nums);
        mergeSort(mid + 1, high, nums);
        merge(low, mid, high, nums);
    }

    private void merge(int low, int mid, int high, int[] arr) {
        int[] temp = new int[arr.length];
        int left = low, right = mid + 1, idx = low;;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[idx++] = arr[left++];
            }
            else {
                temp[idx++] = arr[right++];
            }
        }

        // in left array left out elements
        while (left <= mid) {
            temp[idx++] = arr[left++];
        }

        // in right array left out elements 
        while (right <= high) {
            temp[idx++] = arr[right++];
        }

        // copy the temp array to nums array
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }

    public int[] sortArray(int[] nums) {
        mergeSort(0, nums.length - 1, nums);
        return nums;
    }
}