class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        int n1=s1.length();
        int n2=s2.length();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int f1[]=new int[26];
        int f2[]=new int[26];
        if(n1!=n2) return false;
        for(int i=0;i<n1;i++){
            f1[s1.charAt(i)-'a']++;
            f2[s2.charAt(i)-'a']++;
        }
        return Arrays.equals(f1,f2);
    
    }
}
