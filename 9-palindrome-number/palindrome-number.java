class Solution {
    public boolean isPalindrome(int x) {
        int rev = reverse(x);
        int org = x;
        if(rev == org){
            return true;
        }
        else{
            return false;
        }


        
    }

     public int reverse(int x) {
        int revNum = 0;
        
        while (x > 0) {
            int ld = x % 10;

            revNum = revNum * 10 + ld;
            x = x / 10;
        }

        return revNum;
    }
}