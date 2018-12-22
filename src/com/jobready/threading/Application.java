package com.jobready.threading;

/**
 * Created by nadimchouglay on 23/04/2018.
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("hello there");//single threading
        Task taskRunner = new Task();
        taskRunner.start(); //if u wanna start loop again u have to create instance of task class again as that would
        //allow jvm to start a new thread and would dl the job;
    }
}
class Task extends Thread{
    public void run(){
        for (int i =0;i<1000;i++){
            System.out.println("number: " +i);

        }
    }

}
