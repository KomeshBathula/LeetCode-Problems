class Solution {
    public String convertDateToBinary(String date) {
        String arr[] = date.split("-");
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<arr.length;i++){
            result.append(Integer.toBinaryString(Integer.valueOf(arr[i])));
            if(i<arr.length-1) result.append("-");
        }
        return result.toString();
    }
}