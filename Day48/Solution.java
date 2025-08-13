class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String,ArrayList<String>> map=new HashMap<>();
        for(String str:arr){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());
        }
    
}
