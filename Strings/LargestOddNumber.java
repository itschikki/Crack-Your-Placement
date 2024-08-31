class LargestOddNumber {
    public String largestOddNumber(String num) {
      for (int i = num.length() - 1; i >= 0; --i)
        if ((num.charAt(i) - '0') % 2 == 1)
          return num.substring(0, i + 1);
      return "";
    }

        public static void main(String[] args) {
          LargestOddNumber sol = new LargestOddNumber();
            String num = "123456";
    
            String result = sol.largestOddNumber(num);
            System.out.println(result);
        }
      }