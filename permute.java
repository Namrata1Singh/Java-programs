package Questions;
import java.util.*;
public class permute {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = "abcd";
      String ptr = "";
      recur(str,ptr);
    }
    public static void recur(String str, String ptr){
        if(str.length() == 0){
            System.out.println(ptr);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String ns = str.substring(0,i)+str.substring(i+1);
            recur(ns,ptr+ch);

        }
    }
}
