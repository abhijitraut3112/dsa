class Solution {
    public int maxVowels(String s, int k) {
         int currentVowels = 0;
        int maxVowels = 0;

        // First window
        for (int right = 0; right < k; right++) {
            if (isVowel(s.charAt(right))) {
                currentVowels++;
            }
        }

        maxVowels = currentVowels;

        // Slide the window
        int left = 0;

        for (int right = k; right < s.length(); right++) {

            // Remove left character
            if (isVowel(s.charAt(left))) {
                currentVowels--;
            }

            // Add right character
            if (isVowel(s.charAt(right))) {
                currentVowels++;
            }

            maxVowels = Math.max(maxVowels, currentVowels);

            left++;
        }

        return maxVowels;
        
    }

    private boolean isVowel(char c) {

    return c == 'a' ||  c == 'e' ||  c == 'i' ||  c == 'o' ||  c == 'u';
    }
}