package yuriy.labs.l_2_05;


/**
 * Created by Ruble on 08.04.2017.
 */
/*Lab Work 2-5-2
        Create class MyInit with field arr of array of integers and non-static
        initialization block
        which will initialize that array with random values (Size of array is 10).
        To generate random numbers you can use next code:
        arr[i]= (int) (100 * Math.random()).
        (Or using Random class instance and nextInt() method invocation).
        Add to class MyInit and method printArray() which will print values of this array.
        Create class Main, which will create two instances of class MyInit and invoke method
        printArray() to print values of their arrays on console.
        Example of output:
        23,43,11,34,78,59,34,61,24,2
        5,48,50,3,1,4,67,62,78,98
        */
public class MyInit {
    static int length = (int) (15 * Math.random());
    // lab 2_5_2
    /*private int arr[] = new int[length];
    {
        for (int i = 0; i < arr.length; i++){
            arr[i]= (int) (100 * Math.random());
        }
    }*/
    // -----------------------------------------

    // lab 2_5_3
    /*private static int arr[] = new int[length];
    {
        for (int i = 0; i < arr.length; i++){
            arr[i]= (int) (100 * Math.random());
        }
    }
    public void printArray(){
        for (int i = 0; i <= (arr.length-1); i++){
            System.out.print(arr[i]+ ", ");
        }
        System.out.println(arr[arr.length-1]);
        //arrays of the same length because static field is common to all objects of class
    }*/
    // -----------------------------------------

    // lab 2_5_4
    private static int arr[] = new int[length];
    static {
        for (int i = 0; i < arr.length; i++){
            arr[i]= (int) (100 * Math.random());
        }
    }
    public void printArray(){
        for (int i = 0; i <= (arr.length-1); i++){
            System.out.print(arr[i]+ ", ");
        }
        System.out.println(arr[arr.length-1]);
        //the arrays are equal, because static block is common to all objects  of class
    }
}

class Main2 {
    public static void main(String[] args) {
        MyInit myInit1 = new MyInit();
        myInit1.printArray();
        MyInit myInit2 = new MyInit();
        myInit2.printArray();
    }
}
