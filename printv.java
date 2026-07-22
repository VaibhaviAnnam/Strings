//Find the number of vowels in the string 
public class printv{
    public static int  vowels (String s){
        int count=0;
       
        for(int i=0; i<s.length();i++){
           char ch = Character.toLowerCase(s.charAt(i));
            if (ch =='a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){
                count++;
            }
        }
        return count;
    }
    public static void main (String args []){
        String s = "Vaibhavi Is a very nice girl ";
        System.out.println("Number of vowels:" +  vowels(s));
    }
    
}