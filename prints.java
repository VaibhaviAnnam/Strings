//import java.util.*;
public class prints{
    public static void print(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + "  ");
        }
    }
    public static void main(String[] args){
        /*String str = "Hello";
        char arr[] ={'a', 'b', 'c'};
        String str1 = new String("xyz");

        Scanner sc = new Scanner(System.in);
        String name;
        name=sc.nextLine();
        System.out.println(name);

        String fullname = "Vaibhavi Annam";
        System.out.println(fullname.length());*/


        String  firstname = "Vaibhavi";
        String lastname = "Annam";
        String fullname = firstname + " " + lastname;
       // System.out.println(fullname.charAt(1));
       print(fullname) ;
          }
}