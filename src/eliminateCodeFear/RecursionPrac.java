package eliminateCodeFear;

/**
 * Created by nadimchouglay on 09/10/2018.
 */
public class RecursionPrac {
    public static void main(String[] args) {
        System.out.println(allDollars("hello"));//h$e$l$
        System.out.println(allDollars("james"));

    }
    public static String allDollars(String str){
      if (str.length()<=1){
          return str;
      }
        return str.charAt(0)+"$"+allDollars(str.substring(1));
    }
}
