class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,res=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                res++;
            }
            if(map.containsKey(sum-k)){
                res+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            } 
        
      return res;
    }
}
