package eliminateCodeFear;

/**
 * Created by nadimchouglay on 05/10/2018.
 */
public class LoopsPrac {
    public static void main(String[] args) {
        int counter =0;
        for (int idx =0;idx<30;idx++){
            for (int j=0;j<10;j++){
                System.out.println("the value of idx was"+idx+"......"+j);
                counter++;
            }
        }
        System.out.println("counter is :"+counter);
    }
}
