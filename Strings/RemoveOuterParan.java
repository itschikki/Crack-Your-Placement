class Solution {
    public String removeOuterParentheses(String s) {
          StringBuilder str=new StringBuilder();
          int cnt=0;
          for(int i=0;i<str.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(cnt!=0){
                    str.append(ch);
                }
                cnt++;
            }else{
                if(cnt>1){
                    str.append(ch);
                }
                cnt--;
            }
          }
          return str.toString();
    }
}