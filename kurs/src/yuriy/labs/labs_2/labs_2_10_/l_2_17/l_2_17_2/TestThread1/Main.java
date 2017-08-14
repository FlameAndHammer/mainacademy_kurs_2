package yuriy.labs.labs_2.labs_2_10_.l_2_17.l_2_17_2.TestThread1;

/**
 * Created by Ruble on 11.07.2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("------ B O M B -------");
        MyTimeBomb bomb1 = new MyTimeBomb();
        Thread thread1 = new Thread();  //для того что бы запустить задачу в новом потоке,
        // поток должен знать про эту задачу
        //(использовать конструктор, который принимает Runnable)
        bomb1.run();   //работа, которая написана в методе run выполнится НЕ в новом потоке, а в main
        thread1.start(); //а новый поток не выполняет никакой работы

    }
}
