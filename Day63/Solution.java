class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        int n=arr.length;
        int res=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                res=i+1;
            }
            if(map.containsKey(sum)){
                res=Math.max(res,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return res;
    }
}
