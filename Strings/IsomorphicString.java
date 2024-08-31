class IsomorphicString {
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
    
            int[] sMap = new int[256]; // Assuming ASCII characters
            int[] tMap = new int[256];
    
            for (int i = 0; i < s.length(); i++) {
                char charS = s.charAt(i);
                char charT = t.charAt(i);
    
                if (sMap[charS] != tMap[charT]) {
                    return false;
                }
    
                sMap[charS] = i + 1; // Use index + 1 to avoid 0 for unused characters
                tMap[charT] = i + 1;
            }
    
            return true;
        }
        public static void main(String[] args) {
            IsomorphicString obj = new IsomorphicString();
            boolean result = obj.isIsomorphic("paper", "title");
            System.out.println(result);
        }
    }
