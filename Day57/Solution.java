import java.util.ArrayList;
import java.util.HashSet;

class GfG {
    static ArrayList<Integer> countDistinct(int[] arr, int k) {
        int n = arr.length;  
        ArrayList<Integer> res = new ArrayList<>();
      
        // Iterate over every window
        for (int i = 0; i <= n - k; i++) {
          
            // Hash Set to count unique elements
            HashSet<Integer> st = new HashSet<>();
            for(int j = i; j < i + k; j++)
                st.add(arr[j]);
          
            // Size of set denotes the number of unique elements
            // in the window
            res.add(st.size());
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        ArrayList<Integer> res = countDistinct(arr, k);
        for(int ele: res)
            System.out.print(ele + " ");
    }
}
