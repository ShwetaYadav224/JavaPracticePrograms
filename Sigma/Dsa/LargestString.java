public class LargestString {
    //laxicographic
    //compareTo
    //str1.compareTo(str2)
    //0:equals
    //<0: -tive str1<str2
    //>0: +tive str1>str2
    //ComparetoIgnoreCase A/a treat as same
    public static void main(String[] args) {
        String Fruit[]={"Apple", "mango","banana"};
        String largest=Fruit[0];
        for(int i=1;i<Fruit.length;i++){
           if(largest.compareTo(Fruit[i])<0){
            largest=Fruit[i];
           }
        }System.out.println(largest);

    }
}
