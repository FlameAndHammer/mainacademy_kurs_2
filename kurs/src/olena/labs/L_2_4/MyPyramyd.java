package olena.labs.L_2_4;

/**
 * Created by elenafostachuk on 4/12/17.
 */
public class MyPyramyd {
    public static void printPyramyd(int h){

    for(int level= 1; level <= h; level++){
            for(int count = 1; count <= (h - level); count ++){
                System.out.print(" ");
            }
            for(int value = 1; value <=level; value++){
                System.out.print( value);
            }
            for(int value = (level - 1); value>= 1; value--){
                System.out.print(value);
            }
            System.out.println();
        }
        System.out.println();
    }
}


