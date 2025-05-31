
class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n1=a.length;
        int n2=b.length;
        int i=n1-1,j=0;
        while(i>=0 && j<n2){
            if(a[i]>b[j]){
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                j++;
                i--;
                
            }else{
                i--;
                
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
