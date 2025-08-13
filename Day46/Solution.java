class GfG {
    static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> st = new HashSet<>();

        // Put all elements of a[] in st
        for (int num : a)
            st.add(num);

        // Put all elements of b[] in st
        for (int num : b)
            st.add(num);
		
      	ArrayList<Integer> res = new ArrayList<> ();
      
        // iterate through the set 
        // to fill the result array 
        for(int it: st) 
            res.add(it);

        return res;
    }
