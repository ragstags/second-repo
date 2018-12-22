package eliminateCodeFear;

/**
 * Created by nadimchouglay on 06/10/2018.
 */
public class ArraysPrac {
    public static void main(String[] args) {
        int[] values;
        values = new int[]{1,4,9,16};
//        values[3]= 6;
//        System.out.println(values[3]);
        for (int i=0;i<values.length;i++){
            System.out.println(values[i]);
        }
        for (int i :values){
            System.out.println(i);
        }
    }
}
