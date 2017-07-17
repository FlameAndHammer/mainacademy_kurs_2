package _nikulin.forkjoin;

import java.util.concurrent.RecursiveTask;

public class MyTask extends RecursiveTask<Long> {
    private int start;
    private int stop;
    private int[] arr;

    public MyTask(int start, int stop, int[] arr) {
        this.start = start;
        this.stop = stop;
        this.arr = arr;
    }

    @Override
    protected Long compute() {
        if ( (stop - start) <= 100 ) {
            System.out.printf("Calculate from %d, to %d, in %s\n",
                    start, stop, Thread.currentThread().getName());
            long summ = 0;
            for (int i = start; i < stop; i++) {
                summ += arr[i];
            }
            return summ;
        } else {
            System.out.printf("Split from %d, to %d, in %s\n",
                    start, stop, Thread.currentThread().getName());
            int mid = start + (stop - start) / 2;
            MyTask subTask1 = new MyTask(start, mid, arr);
            MyTask subTask2 = new MyTask(mid, stop, arr);
            subTask1.fork();
            subTask2.fork();
            return subTask1.join() + subTask2.join();
        }
    }
}
