
class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return inv(arr,0,arr.length-1);
    }
    static int inv(int[] arr,int l,int r){
        int res=0;
        if(l<r){
            int m=(l+r)/2;
            res+=inv(arr,l,m);
            res+=inv(arr,m+1,r);
            res+=merge(arr,l,m,r);
            
        }return res;
    }static int merge(int[] arr,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        for(int i=0;i<n2;i++)
            right[i]=arr[m+1+i];
        int res=0,i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
                res+=n1-i;
            }
            
        }while(i<n1){
            arr[k++]=left[i++];
        }while(j<n2){
            arr[k++]=right[j++];
        }
      return res;  
        
    }
}
