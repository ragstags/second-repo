package eliminateCodeFear;

/**
 * Created by nadimchouglay on 11/10/2018.
 */
public class WordsCount {
    public static void main(String[] args) {
        System.out.println(wordsCount(new String[]{"a", "bbb", "b", "cc"},1));
        System.out.println(wordsCount(new String[]{"a", "bbb", "b", "cc"},3));

    }
    public static int wordsCount(String[] words,int len){
        int count =0;
        for (int i =0;i<words.length;i++){
            if (words[i].length()==len){
                count++;
            }

        } return count;
    }
}
