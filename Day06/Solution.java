class Solution {
   
    public List<Integer> findMajority(int[] nums) {
        int n=nums.length;
        int ele1=-1;
        int ele2=-1;
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1){
                c1++;
            }else if(nums[i]==ele2){
                c2++;
            }else if(c1==0){
                ele1=nums[i];
                c1=1;
            }else if(c2==0){
                ele2=nums[i];
                c2=1;
            }else{
                c1--;
                c2--;
            }
        }
        c1=0;c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1) c1++;
            else if(nums[i]==ele2) c2++;
        }
        List<Integer> result=new ArrayList<>();
        if(c1>n/3) result.add(ele1);
        if(c2>n/3) result.add(ele2);
        Collections.sort(result);
        return result;
    }
    
}
