class Solution {
    public boolean isPowerOfFour(int n) {
        while(n>=4){
            if(n%4 !=0)return false;
            n=n/4;
        }
        return n==1;//means koi bhi integer ho positive it will return true;
    }
}