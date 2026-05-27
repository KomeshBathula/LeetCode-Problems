class Solution {
    public int numberOfSpecialChars(String word) {
        /*

        HashMap<Character, Integer> map = new HashMap<>();
        // store all occurences overridden by 
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)))
                map.put(word.charAt(i), i);
        }

        // HashSet<Character> counted = new HashSet<>();

        int countOfSpecialChars = 0;
        // now check for the condition
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                char lower = Character.toLowerCase(ch);
                int lowercaseOccur = map.getOrDefault(lower, -2);

                if (lowercaseOccur == -2) continue;

                if (lowercaseOccur < i && lowercaseOccur != -1) {
                    countOfSpecialChars++;
                }

                map.put(lower, -2);
            }
        }

        return countOfSpecialChars;
        */
        int lowercase[]=new int[26];
        int uppercase[]=new int[26];
        Arrays.fill(lowercase,-1);
        Arrays.fill(uppercase,-1);
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z')
            {
                lowercase[ch-'a']=i;
            }
            else{
                int index= ch-'A';
                if(uppercase[index]==-1)
                {
                    uppercase[index]=i;
                }
            }
        }  
        for(int i=0;i<26;i++)
        {
            if(lowercase[i]!=-1 && uppercase[i]!=-1 && lowercase[i]<uppercase[i])
            {
                count++;
            }
        }
        return count;
    }
}