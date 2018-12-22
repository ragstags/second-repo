package naveenArrayList;

/**
 * Created by nadimchouglay on 28/07/2018.
 */
public class Employee {

    String name;
    int age;
    String dept;
    Employee(String name,int age,String dept){
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                '}';
    }
}
