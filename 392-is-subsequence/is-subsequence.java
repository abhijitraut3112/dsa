class Solution {
    public boolean isSubsequence(String s, String t) {

        int sIndex = 0;

        for (int tIndex = 0; tIndex < t.length(); tIndex++) {
            if (sIndex < s.length() && s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
        }

        return sIndex == s.length();
        
    }
}