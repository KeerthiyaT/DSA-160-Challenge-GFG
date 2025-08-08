class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int n=arr.length;
        int l=0,r=n-1,c=0;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum<target){
                l++;
            }else if(sum>target){
                r--;
            }else{
                if(sum==target){
                    int c1=0,c2=0;
                    int ele1=arr[l],ele2=arr[r];
                    while(l<=r && ele1==arr[l]){
                        l++;
                        c1++;
                    }while(l<=r && ele2==arr[r]){
                        r--;
                        c2++;
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
