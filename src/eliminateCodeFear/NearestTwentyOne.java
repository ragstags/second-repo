package eliminateCodeFear;

/**
 * Created by nadimchouglay on 10/10/2018.
 */
public class NearestTwentyOne {
    public static void main(String[] args) {
        System.out.println(nearestTwentyOne(19 , 21));
        System.out.println(nearestTwentyOne(21 , 19));
        System.out.println(nearestTwentyOne(19 , 22));
        System.out.println(nearestTwentyOne(32 , 22));

    }
    public static int nearestTwentyOne(int a ,int b){
       if (a > 21 && b > 21) return 0;
        if (a > 21 && b <=21) return b;
        if (b > 21 && a <= 21) return a;

        if (a > b) return a;
        else
            return b;
    }
}
