class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n=arr.length;
        int sum=0,res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                res=i+1;
            }if(map.containsKey(sum-k)){
                res=Math.max(res,i-map.get(sum-k));
            }if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }return res;
    }
}
