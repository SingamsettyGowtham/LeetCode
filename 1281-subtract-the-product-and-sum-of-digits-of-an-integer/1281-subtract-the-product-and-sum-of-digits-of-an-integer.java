class Solution {
    public int subtractProductAndSum(int n) {
      int rem,p=1,s=0,s1;
        while(n!=0)
        {
            rem=n%10;
            p=p*rem;
            s=s+rem;
            n=n/10;
        }
        return p-s;
        
    }
}
