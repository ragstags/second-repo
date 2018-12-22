package eliminateCodeFear;

/**
 * Created by nadimchouglay on 10/10/2018.
 */
public class TwoSumOne {
    public static void main(String[] args) {
        System.out.println(twoSumOne(1,2,3));
        System.out.println(twoSumOne(3,1,2));
        System.out.println(twoSumOne(3,2,2));

    }
    public static boolean twoSumOne(int a ,int b,int c){
        return ((a+b==c)||(a+c==b)||(b+c==a));
    }
}
