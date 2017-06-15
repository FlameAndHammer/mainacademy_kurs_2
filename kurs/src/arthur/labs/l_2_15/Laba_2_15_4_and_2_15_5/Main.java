package arthur.labs.l_2_15.Laba_2_15_4_and_2_15_5;

/**
 * Created by arthk on 15.06.2017.
 *  *  * Create new project called TestMyGenerator. Add package “com.brainacad.oop.testmygen”.
 * 1) Create class MyNumGenerator with two fields: numOfElm and maxNumb of int type, constructor with two parameters
 * and method generate() which return new collection (of List type) with numOfElm length, filled with numbers
 * from 0 to maxNumb . 2) Create a class Main with a main() method. Add to method main() code to create
 * instance of MyNumGenerator (for example with 5, 64 parameters) and print result of invoking generate() method to console.
 * 3) Execute the program. The program output must be like next example: [43,15,60,2,5]
 *
 * Open project called TestMyGenerator. 1) Add to class MyNumGenerator new method generateDistinct()
 * which return new collection (of Set type) with numOfElm length and filled with distinct
 * (with no duplicate values) numbers (which generated randomly) from 0 to maxNumb.
 * 2) Create a class Main with a main() method. Add to method main() code to create instance of MyNumGenerator
 * (for example with 5,64 parameters) and print result of invoking generateDistinct() method to console.
 * 3) Execute the program. The program output must be like next example: [5,61,47,2,17]
 */
public class Main {
    public static void main(String[] args) {
        MyNumGenerator obj = new MyNumGenerator(20, 32);
        System.out.println(obj.generate());
        System.out.println(obj.generateDistinct());
    }
}
