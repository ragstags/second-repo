package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by nadimchouglay on 19/04/2018.
 */
public class arrayList {
    public static void main(String[] args) {
        ArrayList <String>words = new ArrayList<String>();
        words.add("hello");
        words.add("there");
        words.add("nadee");
        for(String s:words){
            System.out.println(s);
        }
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(100);
        numbers.add(299);
        numbers.add(300);
        numbers.add(899);
        numbers.remove(2);

        for (int i :numbers){
            System.out.println(i);
        }
       //Array list is resizable lets say u started with 10 then u r adding 5 more it will copy the

        //java 5 intro generics in collections where u need to put data type
        //in the angular brackets
    }
}
