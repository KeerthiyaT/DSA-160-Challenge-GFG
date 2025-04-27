class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        int total=0;
        int curMax=0,curMin=0;
        int maxSum=arr[0],minSum=arr[0];
        for(int i=0;i<arr.length;i++){
            curMax=Math.max(arr[i],arr[i]+curMax);
            maxSum=Math.max(maxSum,curMax);
            curMin=Math.min(arr[i],arr[i]+curMin);
            minSum=Math.min(minSum,curMin);
            total+=arr[i];
            
        }
       
        int cirSum=total-minSum;
        if(total==minSum) return maxSum;
        return Math.max(maxSum,cirSum);
        
            
        
        
    }
}
