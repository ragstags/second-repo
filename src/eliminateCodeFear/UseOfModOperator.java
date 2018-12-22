package eliminateCodeFear;

/**
 * Created by nadimchouglay on 10/10/2018.
 */
public class UseOfModOperator {
    public static void main(String[] args) {
        int [] numbers = new int[100];
        for (int i =0;i<numbers.length;i++){
            numbers[i]=i;
        }
        for (int number : numbers){
            if (number%7==0){
                System.out.println(number);
            }
        }
    }
}
