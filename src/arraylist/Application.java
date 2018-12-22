package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nadimchouglay on 20/04/2018.
 */
public class Application {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("lion");
        animals.add("cat");
        animals.add("tiger");
        animals.add("birds");
//        for (int i =0;i<animals.size();i++){
//            System.out.println(animals.get(i));
//
//        }
//        for (String a:animals){
//            System.out.println(a);
//        }

        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle1 = new Vehicle("Toyota","Camery",true,1200);
        Vehicle vehicle2 = new Vehicle("Honda","accord",false,3000);
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
//        for (Vehicle car:vehicles){
//            System.out.println(car);
//        }
        printElements(vehicles);
        printElements(animals);
    }
    public static void printElements(List somelist){
        for(int i =0;i<somelist.size();i++){
            System.out.println(somelist.get(i));
        }
    }
    //array list and linked list both implement list interface however linked list is good for manipulating data
    //and array list is good for retrieving
}
