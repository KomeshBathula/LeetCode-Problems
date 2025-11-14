class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length ;
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}