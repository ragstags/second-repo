package eliminateCodeFear;

/**
 * Created by nadimchouglay on 10/10/2018.
 */
public class RepeatChar {
    public static void main(String[] args) {
        System.out.println(repeatChar("The"));
        System.out.println(repeatChar("hello"));

    }
    public static String repeatChar(String str){
        String result = "";
        for (int i =0; i<str.length();i++){
            char aChar = str.charAt(i);
            result = result +aChar +aChar;
        }
        return result;
    }
}
