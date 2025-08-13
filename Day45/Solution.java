import java.util.HashSet;
import java.util.ArrayList;

class GfG {

    // Function to find intersection of two arrays
    static ArrayList<Integer> intersect(int[] a, int[] b) {
      
        // Put all elements of a[] in sa
        HashSet<Integer> sa = new HashSet<>();
        for (int num : a) {
            sa.add(num);
        }

        ArrayList<Integer> res = new ArrayList<>();

        // Traverse through b[]
        for (int num : b) {
          
            // If the element is in sa
            if (sa.contains(num)) {
                res.add(num);          // Add it to the result array
                sa.remove(num);        // Erase it from sa to avoid duplicates
            }
        }

        return res;
    }
