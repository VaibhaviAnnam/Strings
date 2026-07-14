//Find the index of the first occurrence in a string
//str = vaibhavi, key = vaibhav => 0
//str = leetcode, key = leet => 0
//str = leetcode, key = code => 4
//str = leetcode, key = leeto => -1
public class index{

     public static int find1(String str, String key) {

        for (int i = 0; i <= str.length() - key.length(); i++) {
        int j;
            for ( j = 0; j < key.length(); j++) {
                if (str.charAt(i + j) != key.charAt(j)) {
                    break;
                }
            }

            if (j == key.length()) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        String str="leetcode";
        String key="code";  
    
        System.out.println(find1(str,key));
    }
}