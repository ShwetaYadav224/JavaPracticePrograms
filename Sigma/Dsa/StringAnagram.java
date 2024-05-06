import java.util.*;
public class StringAnagram {
   public static void isAnagram(String str1,String str2){
      str1=str1.toLowerCase();
      str2=str2.toLowerCase();

      if(str1.length()==str2.length()){
      char[] str1CharArray=str1.toCharArray();
      char[] str2CharArray=str2.toCharArray();
      Arrays.sort(str1CharArray);
      Arrays.sort(str2CharArray);
      boolean result=Arrays.equals(str1CharArray,str2CharArray);
      if(result==true){
        System.out.println(str1+" and "+str2+" Anagram string..");
      }
      else{
        System.out.println(str1+" and "+str2+" not Anagram string..");
      }
}
      else{
        System.out.println(str1+" and "+str2+" not Anagram string..");
      }
   }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        isAnagram(str1,str2);
    }
}
