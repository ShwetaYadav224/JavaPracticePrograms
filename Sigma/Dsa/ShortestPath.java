public class ShortestPath {
    public static float shortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            int direction=str.charAt(i);
            if(direction=='N'){
                y++;
            } 
            else if(direction=='S'){
                y--;
            }
            else if(direction=='E'){
                x++;
            }
            else{
                x--;
            }
            
        }
        int X2=x*x;
        int Y2=y*y;
        return (float) Math.sqrt(Y2+X2);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
       float res= shortestPath(str);
       System.out.println(res);

    }
}
