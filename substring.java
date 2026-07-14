public class substring{
    public static String stringsub(String s, int start, int end){
        String sub="";
        for(int i=start;i<end;i++){
            sub+=s.charAt(i);
        }
        return sub;
    }
    public static void main(String args[]){
        String str="vaibhavi";
        int start=0;
        int end=6;
        System.out.println(stringsub(str,start,end));
    }
}