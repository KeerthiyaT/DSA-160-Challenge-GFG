class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int sum=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==target){
                    a.add(i+1);
                    a.add(j+1);
                    return a;
                }
                
            }
            
        }
        a.add(-1);
        return a;
    }
}
