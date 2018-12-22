package arraylist.comparableInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by nadimchouglay on 22/04/2018.
 */
public class Application {
    public static void main(String[] args) {


        HashSet<Integer> list1 = new HashSet<>();
        list1.add(12);
        list1.add(43);
        list1.add(67);
        list1.add(32);
        list1.add(45);
        list1.add(10);
        list1.add(10);

        List<Integer> li = new ArrayList<>(list1);
        ArrayList<Integer> newlist  = new ArrayList<>();
        newlist.add(10);
        newlist.add(32);
        newlist.add(67);
        list1.retainAll(newlist);
       boolean hasValue= list1.contains(32);
        System.out.println(list1);


    }
}