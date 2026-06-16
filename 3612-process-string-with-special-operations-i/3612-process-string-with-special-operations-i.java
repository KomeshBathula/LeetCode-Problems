class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();

        for (char charType : s.toCharArray()) {
            if (charType == '*') {
                if (result.length() > 0) 
                    result.deleteCharAt(result.length() - 1);
            }

            else if (charType == '#') {
                result.append(result.toString());
            }

            else if (charType == '%') {
                result = result.reverse();
            }

            else {
                result.append(charType);
            }
        }

        return result.toString();
    }
}