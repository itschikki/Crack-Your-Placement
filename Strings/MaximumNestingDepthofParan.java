class MaximumNestingDepthofParan {
    public static int maxDepth(String s) {
          int cnt=0;
          int max=0;
          for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                cnt++;
                if(max<cnt){
                    max=cnt;
                }
            }else if(ch==')'){
                cnt--;
            }
          }
          return max;
    }
    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        System.out.println(maxDepth(s));
    }
}