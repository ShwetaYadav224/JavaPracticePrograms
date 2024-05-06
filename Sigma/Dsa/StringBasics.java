import java.util.*;
public class StringBasics {
    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
       /* String str="abcd";
        String str2=new String("abcd");
       Scanner sc= new Scanner(System.in);
       String name=sc.next();
       System.out.println(name);
       String fullName=sc.nextLine();
       System.out.println(fullName);*/
       //length
      /*  System.out.println(str.length()); 
       System.out.println(str.charAt(0));
       printLetter(str);*/
       String str="ApnaCollege".replace("l","");
       System.out.println(str);
    }
}
