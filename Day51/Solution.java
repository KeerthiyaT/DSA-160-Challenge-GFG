class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n=arr.length;
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<n-2;i++){
            int j=i+1,k=n-1;
            while(j<k){
                int s=0;
                s+=arr[i]+arr[j]+arr[k];
                if(s>target){
                    k--;
                }else if(s<target){
                    j++;
                }else{
                    int ele1=arr[j],ele2=arr[k];
                    int c1=0,c2=0;
                    while(j<=k && ele1==arr[j]){
                        c1++;
                        j++;
                    }while(j<=k && ele2==arr[k]){
                        c2++;
                        k--;
                    }
                    if(ele1==ele2){
                        c+=(c1*(c1-1))/2;
                    }else{
                        c+=c1*c2;
                    }
                }
            }
        }return c;
    }
}
