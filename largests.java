//by lexcico order

public class largests{
    public static void main(String arg[]){
        String fruits[] = {"Apple", "Banana",  "Grapes"};
        String largest = fruits[0];
         for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
    }
    System.out.println(largest);
    }
}