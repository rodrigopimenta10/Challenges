class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Empty strs edge case
        if (strs.length == 0) return "";
        
        String prefix = strs[0];
        //Iterate through all the strings
        for(int i = 1; i < strs.length; i++){
            //If prefix isnt in the index of the next string, shorten prefix by one and see if updated prefix is in next string.
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                //If you shorten the prefix until empty, there is no prefix in this array of strings.
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}