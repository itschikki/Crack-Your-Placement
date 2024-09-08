public class printGFGntimes {

        public static void printGfg(int N) {
            if(N<=0){
                return;
            }
            printGfg(N-1);
            System.out.print("GFG"+" ");
        }
        public static void main(String[] args) {
            printGfg(5);
        }
}
