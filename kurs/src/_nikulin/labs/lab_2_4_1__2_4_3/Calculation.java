package _nikulin.labs.lab_2_4_1__2_4_3;

public class Calculation {

    public static void main(String[] args) {
	        // lab 2_4_1 and lab 2_4_2
        int[] array_1 = {4, 7, 2, 0, -1, 8, -5};
        int[] array_2 = {55, 64, -98, 12, 45, -23, 15, 37, -77, 11};

        System.out.println("Minimum in array_1: " + MyMath.findMin(array_1));
        System.out.println("Minimum in array_2: " + MyMath.findMin(array_2));
        System.out.println("Maximum in array_1: " + MyMath.findMax(array_1));
        System.out.println("Maximum in array_2: " + MyMath.findMax(array_2));

            // lab 2_4_3
        System.out.println("-------------------------------------");
        System.out.println("The area of a circle: " + MyMath.areaOfCircle(3.3));
        System.out.println("The area of a circle: " + MyMath.areaOfCircle(5.0));
        System.out.println("The area of a circle: " + MyMath.areaOfCircle(1));
    }
}
