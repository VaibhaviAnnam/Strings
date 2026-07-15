public class stringmatching{
    public static boolean isMataching(String s, String p){
        if(s ==  p){
       // if(s.equals(p)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        String s ="aabaacd";
        String p = "aaba";
        System.out.print(isMataching(s, p));
    }
}
/*Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
Return a boolean indicating whether the matching covers the entire input string (not partial).*/

 