class Solution {
    public String interpret(String command) {
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<command.length() - 1;i++){
            char ch1 = command.charAt(i);
            char ch2 = command.charAt(i+1);
            if(ch1 == '(' && ch2 == ')') res.append('o');
            if(ch1 != '(' && ch1 != ')') res.append(ch1);
        }
        if(command.charAt(command.length() - 1) != ')' && command.charAt(command.length() - 1) != '{') res.append(command.charAt(command.length() - 1));
        return res.toString();
    }
}