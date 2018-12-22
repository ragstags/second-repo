package eliminateCodeFear;

/**
 * Created by nadimchouglay on 10/10/2018.
 */
public class SpeedingFine {
    public static void main(String[] args) {
        System.out.println(speedingFine(60,false));
        System.out.println(speedingFine(65,true));
        System.out.println(speedingFine(85,false));

    }
    public static int speedingFine(int speed,boolean isHoliday){
        int maxSpeed =80;
        int minSpeed =60;
        int fine = 0;
        if (isHoliday){
           minSpeed+=5;
            maxSpeed+=5;
        }
        if (speed>=maxSpeed)
            fine =200;
        if (speed<=minSpeed)
            fine =0;
        return fine;
    }
}
