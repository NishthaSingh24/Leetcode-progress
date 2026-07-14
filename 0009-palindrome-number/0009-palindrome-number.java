class Solution {
    public boolean isPalindrome(int x) {

        if(x<0) return false;

        int revNum = 0;
        int originalNum = x;

        while(x>0){
            int digit = x % 10;
            revNum = (revNum*10)+digit;
            x = x/10;
        }
        return originalNum == revNum;
    }
}