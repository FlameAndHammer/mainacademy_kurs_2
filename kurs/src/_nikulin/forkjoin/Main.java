package _nikulin.forkjoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        int[] arr = getArr();
        MyTask task = new MyTask(0, arr.length, arr);
        ForkJoinPool pool = new ForkJoinPool(10);
        System.out.println(pool.invoke(task));
    }

    private static int[] getArr() {
        int[] arr = new int[1000];
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
