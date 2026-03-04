public class backtrack {
        public static void printSubsets(String str,String ans){
            if(str.length()==0){
                System.out.println(ans);
                return;
            }
            char ch = str.charAt(0);
            String remaining = str.substring(1);
            
            printSubsets(remaining, ans+ch);
            printSubsets(remaining, ans);

        }
        public static void main(String[] args) {
            printSubsets("abc", "");
        }
    }
    

