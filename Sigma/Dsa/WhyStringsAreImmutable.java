public class WhyStringsAreImmutable {
    public static void main(String[] args) {
        char ch='a';
        String str="";
        while(ch<='z'){
            str+=ch+" ";
            ch++;
        }
        System.out.println(str);

    }
}
