public class StringPalindrom {
    public static boolean isPalindrome(String str){
             for(int i=0;i<str.length()/2;i++){
                int n=str.length();
                 if(str.charAt(i)!= (str.charAt(n-1-i))){
                    return false;
                 }
             }
             return true;
    }
    public static void main(String[] args) {
        String str="racecar"; 
       boolean res= isPalindrome(str);
       if(res == true) {
        System.out.println("True");
    }
    else {
        System.out.println("false");
    };
    }
}
