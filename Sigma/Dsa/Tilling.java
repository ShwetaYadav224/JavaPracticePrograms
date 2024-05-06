package Dsa;

public class Tilling {
    public static int tilligProblem(int n){
     if(n==0 ||n==1){
        return 1;
     }
     int fm1=tilligProblem(n-1);
     int fm2=tilligProblem(n-2);
     int totalWay=fm1+fm2;
     return totalWay;

    }
    public static void removeDuplicates(String str,StringBuilder newString,int i,boolean map[]){
            if(i==str.length()){
             System.out.println(newString);
                return;
            }
            char currchar=str.charAt(i);
            if(map[currchar-'a']== true){
                removeDuplicates(str, newString, i+1, map);
            }
            else{
                map[currchar-'a']=true;
                removeDuplicates(str,newString.append(currchar), i+1, map);

            }
    }
    public static int pairingFriends(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1=pairingFriends(n-1);
        int fnm2=pairingFriends(n-2);
        int pairways=(n-1)*fnm2;
        int totways=fnm1+pairways;
        return totways;
    }
    public static void main(String[] args) {
       System.out.println(tilligProblem(4));
       String str="apanacollege";
       removeDuplicates(str,new StringBuilder(), 0, new boolean[26]);
       System.out.println(pairingFriends(3));
    }
    
}
