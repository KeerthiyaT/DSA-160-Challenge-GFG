class Solution { 
    public int maximumProfit(int prices[]) {
        int minimum=prices[0];
        int n=prices.length;
        int res=0;
        for(int i=1;i<n;i++){
            minimum=Math.min(minimum,prices[i]);
            res=Math.max(res,prices[i]-minimum);
        }
        return res;
    }
}
