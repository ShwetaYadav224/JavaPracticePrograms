public class Substring {
public static String subString(String str,int si,int ei){
    String subStr="";
    for(int i=si;i<ei;i++){
        subStr+=str.charAt(i);
    }
    return subStr;
}
    public static void main(String[] args) {
        String str="HelloWorld";
       String st1= str.substring(2,5);
      String sr=  subString(str,3,7);// inbuilt function
      System.out.println(sr);
      System.out.println(st1);
    }
}
