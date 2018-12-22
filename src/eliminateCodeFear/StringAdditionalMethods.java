package eliminateCodeFear;

/**
 * Created by nadimchouglay on 10/10/2018.
 */
public class StringAdditionalMethods {
    public static void main(String[] args) {
        String sentence = "there is a small boat by the doc";
        String sentence2 = "There are several people at the party";

        System.out.println(sentence.startsWith("is"));
        int age = 29;

        String ageAsStr = String.valueOf(age);
        System.out.println(ageAsStr+27);
    }
}
