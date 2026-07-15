// Given a route containing the directions 'N', 'S', 'E', or 'W', find the shortest path to reach the destination. Return the length of the shortest path.
public class direction{
    public static float pshortest(String str){
       int  x=0 , y=0;
       for(int i =0;i<str.length();i++){
        char dir=str.charAt(i);

        //West
        if(dir =='W'){
            x--;
        }
        //East        
        else if(dir == 'E'){
            x++;
        }
        //orth 
        else if(dir == 'N'){
            y++;
        }
        //South
        else if(dir =='S'){
            y--;
        }
       } 
       int x2 = x*x; //x square
       int y2 = y*y; //y square
    return (float)Math.sqrt(x2 + y2);
    }
public static void main(String args[]){
   String str="WNEENESENNN"; //5
    //String str ="NS"; //0
    System.out.println(pshortest(str));
}
}