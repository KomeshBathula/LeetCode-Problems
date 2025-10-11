class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        StringBuilder sb = new StringBuilder();
        char ch = chars[0];
        int count = 1;
        for(int i = 1;i<chars.length;i++){
            if(ch == chars[i]) count++;
            else{
                sb.append(ch);
                if(count>1) sb.append(count);
                ch = chars[i];
                count = 1;
            }
        }
        sb.append(ch);
        if(count>1) sb.append(count);
        for(int i = 0;i<sb.length();i++) chars[i] = sb.charAt(i);
        return sb.length();
    }
}