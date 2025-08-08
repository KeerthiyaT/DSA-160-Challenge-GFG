class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int l=0,r=n-1;
        if(n<2){
            return new ArrayList<>();
        }
        List<Integer> res=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        boolean found=false;
      while(l<r){
          int a=arr[l];
          int b=arr[r];
          int sum=a+b;
          int diff=Math.abs(sum-target);
          if(diff<min){
              min=diff;
              res=Arrays.asList(a,b);
              found=true;
          }else if(diff==min){
              if(Math.abs(a-b)>Math.abs(res.get(0)-res.get(1))){
                  res=Arrays.asList(a,b);
              }
          }
          if(sum<target){
              l++;
          }else{
              r--;
          }
      }return found?res:new ArrayList<>();
       
    }
}
