class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int sum=0,res=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum^=arr[i];
            if(map.containsKey(sum^k)){
                res+=map.get(sum^k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}
