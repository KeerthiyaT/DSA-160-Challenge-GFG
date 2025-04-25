class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int n=prices.length;
        int r=0;
        for(int i=1;i<n;i++){
            if(prices[i-1]<prices[i]){
                r+=prices[i]-prices[i-1];
            }
        }
        return r;
    }
}
